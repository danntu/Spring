package javatpoint.springaop.aspectannotation.around;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("src/test/applicationContext.xml");

        Operation op = (Operation) context.getBean("opBean4");
        op.msg();
        op.display();
    }
}

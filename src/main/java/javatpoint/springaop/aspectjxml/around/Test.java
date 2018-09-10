package javatpoint.springaop.aspectjxml.around;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Operation op = (Operation) context.getBean("opBean9");
        op.msg();
        op.display();
    }
}

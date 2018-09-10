package javatpoint.springaop.aspectannotation.autothrowing;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Operation op = (Operation) context.getBean("opBean5");
        System.out.println("calling validate...");
        try {
            op.valid(19);
        } catch (Exception e) {
            System.out.println("calling validate again...");
        }
        try {
            op.valid(11);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

package javatpoint.fabric_method.type3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Printable printable = (Printable) context.getBean("p");
        printable.print();

    }
}

package javatpoint.fabric_method.type2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Printable printable = (Printable) context.getBean("printa");
        printable.print();
        Printable printableb = (Printable) context.getBean("printb");
        printableb.print();
    }
}

package javatpoint.fabric_method.type1;

import javatpoint.fabric_method.type1.A;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        A a = (A) context.getBean("factorymethodA");
        a.msg();
    }
}

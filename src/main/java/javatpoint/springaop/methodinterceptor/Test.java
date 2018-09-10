package javatpoint.springaop.methodinterceptor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("src/test/applicationContext.xml");
        A a = context.getBean("proxy3", A.class);
        //System.out.println("proxy class name: " + a.getClass().getName());
        a.m();
    }
}

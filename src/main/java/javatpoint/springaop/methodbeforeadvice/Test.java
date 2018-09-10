package javatpoint.springaop.methodbeforeadvice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        A a = context.getBean("proxy1", A.class);
        a.m();
    }
}

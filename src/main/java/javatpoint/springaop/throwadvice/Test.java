package javatpoint.springaop.throwadvice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("src/test/applicationContext.xml");
        Validator validator = context.getBean("proxy4", Validator.class);
        try {
            validator.validate(12);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

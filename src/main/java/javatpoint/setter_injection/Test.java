package javatpoint.setter_injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("src/test/applicationContext.xml");
        Employee employee = (Employee) context.getBean("setter");
        employee.display();
    }
}

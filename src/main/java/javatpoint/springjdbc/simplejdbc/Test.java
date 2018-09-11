package javatpoint.springjdbc.simplejdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        EmployeeDAO dao = (EmployeeDAO) context.getBean("simpledao");
        int status = dao.update(new Employee(23, "John uodate", 3000));
        System.out.println(status);
    }
}

package javatpoint.springjdbc.namedparameter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        EmployeeDAO dao = (EmployeeDAO) context.getBean("namedparameter");
        dao.save(new Employee(23, "John", 2000));
    }
}

package javatpoint.springjdbc.resultset;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        EmployeeDAO employeeDAO = (EmployeeDAO) context.getBean("resultsetdao");
        List<Employee> list = employeeDAO.getAllEmployees();

        list.forEach(e -> System.out.println("id = " + e.getId() + " name = " + e.getName() + " salary = " + e.getSalary()));
    }
}

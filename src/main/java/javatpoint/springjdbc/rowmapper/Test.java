package javatpoint.springjdbc.rowmapper;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        EmployeeDAO dao = (EmployeeDAO) context.getBean("rowmapper");
        List<Employee> list = dao.getAllEmployeesRowMapper();

        list.forEach(employee -> System.out.println(employee));
    }
}

package javatpoint.orm.hibernate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        EmployeeDao dao = (EmployeeDao) context.getBean("hemdao");

        Employee employee = new Employee();
        employee.setId(114);
        employee.setName("varun");
        employee.setSalary(30000);

        dao.saveEmployee(employee);
    }
}

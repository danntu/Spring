package javatpoint.jdbctemplate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        EmployeeDao dao = (EmployeeDao) context.getBean("edao");
//         insert record
        Employee employee = new Employee();
        employee.setId(1);
        employee.setName("Danik by update");
        employee.setSalary(15000);
        //insert record
        //int status = dao.saveEmployee(employee);

        //update record
        //int status = dao.updateEmployee(employee);

        // delete record
        int status = dao.deleteEmployee(employee);
        System.out.println(status);

    }
}

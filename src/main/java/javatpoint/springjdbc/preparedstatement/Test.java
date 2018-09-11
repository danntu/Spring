package javatpoint.springjdbc.preparedstatement;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        EmployeeDAO dao = (EmployeeDAO) context.getBean("prepareddao");
        boolean status;
        dao.saveEmployeeByPreparedStatement(new Employee(110, "Akmaral", 800));

        Employee employee = new Employee();
        employee.setId(108);
        employee.setName("Danik update");
        employee.setSalary(15000);

//        status = dao.updateEmployeeByPreparedStatement(employee);
//        if (!status){
//            System.out.println("Record updated");
//        }

//        status = dao.deleteEmployeeByPreparedStatement(employee);
//        if (!status) {
//            System.out.println("Record deleted");
//        }
    }
}

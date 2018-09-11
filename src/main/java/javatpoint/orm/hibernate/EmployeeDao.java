package javatpoint.orm.hibernate;

import org.hibernate.FlushMode;
import org.hibernate.Session;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDao {
    HibernateTemplate template;

    public void setTemplate(HibernateTemplate template) {
        this.template = template;

    }

    @Transactional(readOnly = false, propagation = Propagation.REQUIRES_NEW)
    public void saveEmployee(Employee employee) {
        template.save(employee);
    }

    public void updateEmployee(Employee employee) {
        template.update(employee);
    }

    public void deleteEmployee(Employee employee) {
        template.delete(employee);
    }

    public Employee getById(int id) {
        Employee employee = (Employee) template.get(Employee.class, id);
        return employee;
    }

    public List<Employee> getEmployees() {
        List<Employee> list = new ArrayList<>();
        list = template.loadAll(Employee.class);
        return list;
    }
}

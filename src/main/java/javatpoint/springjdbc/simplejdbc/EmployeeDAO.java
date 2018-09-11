package javatpoint.springjdbc.simplejdbc;

import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.jdbc.core.simple.SimpleJdbcTemplate;

public class EmployeeDAO {
    private SimpleJdbcTemplate simpleJdbcTemplate;

    public EmployeeDAO(SimpleJdbcTemplate simpleJdbcTemplate) {
        this.simpleJdbcTemplate = simpleJdbcTemplate;
    }

    public int update(Employee employee) {
        String query = "update employee set name=? where id=?";
        return simpleJdbcTemplate.update(query, employee.getName(), employee.getId());
    }
}

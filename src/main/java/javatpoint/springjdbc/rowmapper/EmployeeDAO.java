package javatpoint.springjdbc.rowmapper;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class EmployeeDAO {
    private JdbcTemplate jdbcTemplate4;

    public void setJdbcTemplate4(JdbcTemplate jdbcTemplate4) {
        this.jdbcTemplate4 = jdbcTemplate4;
    }

    public List<Employee> getAllEmployeesRowMapper() {
        return jdbcTemplate4.query("select * from employee", new RowMapper<Employee>() {
            @Override
            public Employee mapRow(ResultSet resultSet, int i) throws SQLException {
                Employee employee = new Employee();
                employee.setId(resultSet.getInt(1));
                employee.setName(resultSet.getString(2));
                employee.setSalary(resultSet.getInt(3));
                return employee;
            }
        });
    }
}

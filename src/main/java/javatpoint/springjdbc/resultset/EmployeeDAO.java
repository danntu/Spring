package javatpoint.springjdbc.resultset;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDAO {
    private JdbcTemplate jdbcTemplate3;

    public void setJdbcTemplate3(JdbcTemplate jdbcTemplate3) {
        this.jdbcTemplate3 = jdbcTemplate3;
    }

    public List<Employee> getAllEmployees() {
        return jdbcTemplate3.query("select * from employee", new ResultSetExtractor<List<Employee>>() {
            @Override
            public List<Employee> extractData(ResultSet resultSet) throws SQLException, DataAccessException {
                List<Employee> list = new ArrayList<Employee>();
                while (resultSet.next()) {
                    Employee employee = new Employee();
                    employee.setId(resultSet.getInt(1));
                    employee.setName(resultSet.getString(2));
                    employee.setSalary(resultSet.getInt(3));
                    list.add(employee);
                }
                return list;
            }
        });
    }
}

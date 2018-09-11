package javatpoint.springjdbc.namedparameter;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

public class EmployeeDAO {
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    public EmployeeDAO(NamedParameterJdbcTemplate namedParameterJdbcTemplate) {
        this.namedParameterJdbcTemplate = namedParameterJdbcTemplate;
    }

    public void save(Employee employee) {
        String query = "insert into employee values (:id,:name,:salary)";
        Map<String, Object> map = new HashMap<>();
        map.put("id", employee.getId());
        map.put("name", employee.getName());
        map.put("salary", employee.getSalary());

        namedParameterJdbcTemplate.execute(query, map, new PreparedStatementCallback<Object>() {
            @Override
            public Object doInPreparedStatement(PreparedStatement preparedStatement) throws SQLException, DataAccessException {
                return preparedStatement.executeUpdate();
            }
        });
    }
}

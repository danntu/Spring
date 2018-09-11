package javatpoint.springjdbc.preparedstatement;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EmployeeDAO {
    private JdbcTemplate jdbcTemplatePreparedStatement;

    public void setJdbcTemplatePreparedStatement(JdbcTemplate jdbcTemplatePreparedStatement) {
        this.jdbcTemplatePreparedStatement = jdbcTemplatePreparedStatement;
    }

    public Boolean saveEmployeeByPreparedStatement(final Employee employee) {
        String query = "insert into employee values (?,?,?)";
        return jdbcTemplatePreparedStatement.execute(query, new PreparedStatementCallback<Boolean>() {
            @Override
            public Boolean doInPreparedStatement(PreparedStatement preparedStatement) throws SQLException, DataAccessException {
                preparedStatement.setInt(1, employee.getId());
                preparedStatement.setString(2, employee.getName());
                preparedStatement.setInt(3, employee.getSalary());

                return preparedStatement.execute();
            }
        });
    }

    public Boolean updateEmployeeByPreparedStatement(final Employee employee) {
        String query = "update employee set name = ?, salary =? where id = ?";
        return jdbcTemplatePreparedStatement.execute(query, new PreparedStatementCallback<Boolean>() {
            @Override
            public Boolean doInPreparedStatement(PreparedStatement preparedStatement) throws SQLException, DataAccessException {
                preparedStatement.setString(1, employee.getName());
                preparedStatement.setInt(2, employee.getSalary());
                preparedStatement.setInt(3, employee.getId());

                return preparedStatement.execute();
            }
        });
    }

    public Boolean deleteEmployeeByPreparedStatement(final Employee employee) {
        String query = "delete from employee where id = ?";
        return jdbcTemplatePreparedStatement.execute(query, new PreparedStatementCallback<Boolean>() {
            @Override
            public Boolean doInPreparedStatement(PreparedStatement preparedStatement) throws SQLException, DataAccessException {
                preparedStatement.setInt(1, employee.getId());

                return preparedStatement.execute();
            }
        });
    }
}

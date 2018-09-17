package javatpoint.mvc.crud.pagination;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class EmpDao {
    JdbcTemplate template;

    public void setTemplate(JdbcTemplate template) {
        this.template = template;
    }

    public List<Emp> getEmployeesByPage(int pageid, int total) {
        String sql = "select * from Emp limit " + (pageid - 1) + "," + total;
        return template.query(sql, new RowMapper<Emp>() {
            @Override
            public Emp mapRow(ResultSet resultSet, int i) throws SQLException {
                Emp emp = new Emp();
                emp.setId(resultSet.getInt(1));
                emp.setName(resultSet.getString(2));
                emp.setSalary(resultSet.getFloat(3));
                return emp;
            }
        });
    }
}

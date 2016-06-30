package usePython.springjdbc.sql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

public class StockdataDaoImpl  implements StockdataDAO{
	
	private DataSource dataSource;
	
	public DataSource getDataSource() {
		return dataSource;
	}

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	@Override
	public void findsql(String sql) {
		
		String query = "select * from tick_data_300296";
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		//List<Employee> empList = new ArrayList<Employee>();

		List<Map<String,Object>> empRows = jdbcTemplate.queryForList(query);
		
		for(Map<String,Object> empRow : empRows){
			System.out.println(empRow.get("price"));
//			Employee emp = new Employee();
//			emp.setId(Integer.parseInt(String.valueOf(empRow.get("id"))));
//			emp.setName(String.valueOf(empRow.get("name")));
//			emp.setRole(String.valueOf(empRow.get("role")));
//			empList.add(emp);
		}
//		return empList;
		
	}

}

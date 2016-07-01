package usePython.springjdbc.sql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

public class StockdataDaoImpl  implements StockdataDao{
	
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
	
	
	
	/**
	 * @param
	 * 	stocknum 股票代码   300296
	 * 	day		 日期       2016-06-24
	 * 	unitprice  起始单价 /计  价单位:元   100000
	 * 
	 * @return
	 * 	sellsum 卖出金额总和  (单位 元)
	 * */
	@Override
	public Long gogetOnedaySellSum(String stocknum, String day, int unitprice) {
		String query = "SELECT sum(amount) FROM tick_data_"+stocknum+" where amount > "+unitprice+"  and type='卖盘' and gupiaodata='"+day+"'";
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		
		long sellsum =-1L ;
		sellsum = jdbcTemplate.queryForLong(query);
		return sellsum;		
	}
	
	/**
	 * @param
	 * 	stocknum 股票代码   300296
	 * 	day		 日期       2016-06-24
	 * 	unitprice  起始单价 /计  价单位:元   100000
	 * 
	 * @return
	 * 	buysum 买入金额总和  (单位 元)
	 * */
	@Override
	public Long gogetOnedayBuySum(String stocknum, String day, int unitprice) {
		String query = "SELECT sum(amount) FROM tick_data_"+stocknum+" where amount > "+unitprice+"  and type='买盘' and gupiaodata='"+day+"'";
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		long buysum =-1L ;
		buysum = jdbcTemplate.queryForLong(query);
		return buysum;	
	}

}

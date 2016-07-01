package usePython.springjdbc.sql.StockDay;

import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

public class StockDayDaoImpl  implements StockDayDao{
		
	private DataSource dataSource;	

	public DataSource getDataSource() {
		return dataSource;
	}

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	/**
	 * @return 
	 *   the number of rows affected 插入的行数  >0 表示成功
	 * */
	@Override
	public int insertStockDay(String stocknum, Long buysell, Long basevalue, String gupiaodata) {
		
		String tableName = "stock_day_"+stocknum;
		String query = " INSERT INTO "+tableName+" ( buysell, basevalue, gupiaodata ) VALUES ( "+buysell+", "+basevalue+", '"+gupiaodata+"')";
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);		
		int returnCode = jdbcTemplate.update(query);		
		return returnCode;
	}
	/**
	 * @return
	 *   数据的总数   0 不存在 
	 *   			
	 * 
	 * */
	@Override
	public int findStockDayByGupiaodata(String stocknum, String gupiaodata) {
		
		String tableName = "stock_day_"+stocknum;
		String query = "SELECT  count(*)  FROM "+tableName+" where  gupiaodata = '"+gupiaodata+"'";
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);		
		int returnCode = jdbcTemplate.queryForInt(query);		
		return returnCode;
		
	}

}

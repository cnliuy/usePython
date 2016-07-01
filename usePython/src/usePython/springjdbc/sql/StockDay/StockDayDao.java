package usePython.springjdbc.sql.StockDay;

public interface StockDayDao {
	/**
	 * @param
	 * 	stocknum 股票代码   300296
	 * 	buysell		 buy-sell的差值   
	 *  basevalue    起始单价, 价单位:元
	 * 	gupiaodata   日期 2016-07-01
	 * 
	 * @return
	 * 	 the number of rows affected 插入的行数  >0 表示成功
	 * 
		INSERT INTO stock_day_600303 ( increasevalue, buysell, basevalue, gupiaodata)
    	VALUES ( 0.25, 123, 12312, '2015-10-12');
	 * 
	 * 
	 * */
	public int insertStockDay(String stocknum ,Long  buysell ,Long  basevalue ,String  gupiaodata );
	
	
	/**
	 * @param
	 * 	stocknum 股票代码   300296
	 * 	gupiaodata   日期 2016-07-01
	 * 
	 * @return
	 * 	数据的总数
	 * 
		SELECT indexid, increasevalue, buysell, basevalue, gupiaodata  FROM stock_day_600303 where  gupiaodata = '2015';
	 * 
	 * 
	 * */
	public int findStockDayByGupiaodata(String stocknum ,String  gupiaodata );
	
}

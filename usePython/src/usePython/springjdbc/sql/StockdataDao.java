package usePython.springjdbc.sql;

public interface  StockdataDao {
	//find sql
	public void findsql(String  stocknum);
	

	/**
	 * @param
	 * 	stocknum 股票代码   300296
	 * 	day		 日期       2016-06-24
	 * 	unitprice  起始单价 /计  价单位:元   100000
	 * 
	 * @return
	 * 	sellsum 卖出金额总和  (单位 元)
	 * */
	public Long gogetOnedaySellSum(String  stocknum ,String  day ,int  unitprice );
	
	/**
	 * @param
	 * 	stocknum 股票代码   300296
	 * 	day		 日期       2016-06-24
	 * 	unitprice  起始单价 /计  价单位:元   100000
	 * 
	 * @return
	 * 	buysum 买入金额总和  (单位 元)
	 * */
	public Long gogetOnedayBuySum(String  stocknum ,String  day ,int  unitprice );
}

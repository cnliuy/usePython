package usePython.springjdbc.sql.StockDay;

/**
 * 
 * 单挑纪录股票的每日 相关数据
 * SQL：
 	CREATE TABLE stock_day_600303 ( indexid bigserial NOT NULL, increasevalue double precision, buysell bigint,
	basevalue bigint, gupiaodata text, CONSTRAINT stock_day_600303_pkey PRIMARY KEY (indexid) )
 * 
 * insert SQL：
 * 
 	INSERT INTO stock_day_600303 ( increasevalue, buysell, basevalue, gupiaodata)
    VALUES ( 0.25, 123, 12312, '2015-10-12');
 * 
 * */
public class StockDayPojo {
	
	private Long indexid;	
	private double increasevalue;
	private Long buysell;
	private Long basevalue;	
	private String  gupiaodata;
	public Long getIndexid() {
		return indexid;
	}
	public void setIndexid(Long indexid) {
		this.indexid = indexid;
	}
	public double getIncreasevalue() {
		return increasevalue;
	}
	public void setIncreasevalue(double increasevalue) {
		this.increasevalue = increasevalue;
	}
	public Long getBuysell() {
		return buysell;
	}
	public void setBuysell(Long buysell) {
		this.buysell = buysell;
	}
	public Long getBasevalue() {
		return basevalue;
	}
	public void setBasevalue(Long basevalue) {
		this.basevalue = basevalue;
	}
	public String getGupiaodata() {
		return gupiaodata;
	}
	public void setGupiaodata(String gupiaodata) {
		this.gupiaodata = gupiaodata;
	}
	

	 
}

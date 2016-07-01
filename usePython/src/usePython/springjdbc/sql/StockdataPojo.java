package usePython.springjdbc.sql;

/**
 * 
 * 股票的每日详细数据
 * CREATE TABLE tick_data_600303(
 * 	  index bigint,
 * 	  "time" text,
 * 	  price double precision,
 * 	  change text,
 * 	  volume bigint,
 * 	  amount bigint,
 * 	  type text,
 * 	  gupiaodata text
 * 	)
 * 
 * */
public class StockdataPojo {
	
	private Long indexid;
	private String  time;
	private double price;
	private String  change;
	private Long volume;
	private Long amount;
	private String  type;
	private String  gupiaodata;
	
	public Long getIndexid() {
		return indexid;
	}
	public void setIndexid(Long indexid) {
		this.indexid = indexid;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getChange() {
		return change;
	}
	public void setChange(String change) {
		this.change = change;
	}
	public Long getVolume() {
		return volume;
	}
	public void setVolume(Long volume) {
		this.volume = volume;
	}
	public Long getAmount() {
		return amount;
	}
	public void setAmount(Long amount) {
		this.amount = amount;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getGupiaodata() {
		return gupiaodata;
	}
	public void setGupiaodata(String gupiaodata) {
		this.gupiaodata = gupiaodata;
	}
	 
	 
}

package usePython.springjdbc.sql;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		  ApplicationContext context = new ClassPathXmlApplicationContext("Beans-SQL.xml");
		  StockdataDaoImpl obj = (StockdataDaoImpl) context.getBean("StockdataDao");
	 
	      Long sellsum = obj.gogetOnedaySellSum("300296", "2016-06-23",15000);
	      Long buysum = obj.gogetOnedayBuySum("300296", "2016-06-23",15000);
	      System.out.println("sellsum："+sellsum);
	      System.out.println("buysum："+buysum);

	}

}

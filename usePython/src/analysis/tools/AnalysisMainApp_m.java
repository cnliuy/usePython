package analysis.tools;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import usePython.springjdbc.sql.StockdataDaoImpl;

public class AnalysisMainApp_m {

	public static void main(String[] args) {
		
		String 	stocknum = "300033";  //300296
		String  daystr[] = {"2016-06-23","2016-06-24"};
		int  basevalue = 15000; //元
		Long buy_sell = 0L;
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans-SQL.xml");
		StockdataDaoImpl std = (StockdataDaoImpl) context.getBean("StockdataDao");
		for( int i=0; i < daystr.length ; i++ ){			
			buy_sell = AnalysisTools.compare_Buy_Sell_inOneDay(std, stocknum, daystr[i], basevalue);
			System.out.println("-----"+daystr[i]+": buy-sell = "+buy_sell);
		}
		
	}

}

package analysis.tools;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import usePython.springjdbc.sql.StockdataDaoImpl;

public class AnalysisTools {
	
	
	
	/**
     * 根据数据库中 每天股票的详细数据(如 tick_data_300033 表 ) 统计某只股票全天的资金进出 
     * 
     * 并得出    
     * 		进-出=差值
     * @param 
     *    stocknum   300296
     *    daystr 2016-06-23  当天的
     *    basevalue   单位:元
     *    
     * */
	public static Long compare_Buy_Sell_inOneDay(StockdataDaoImpl Std ,String stocknum, String daystr ,int basevalue) {
		  Long buysum = Std.gogetOnedayBuySum(stocknum, daystr,basevalue);
	      Long sellsum = Std.gogetOnedaySellSum(stocknum,daystr,basevalue);
	      Long cha = buysum - sellsum;
	      return cha;		 
	}
}

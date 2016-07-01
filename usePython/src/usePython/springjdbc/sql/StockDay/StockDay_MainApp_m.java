package usePython.springjdbc.sql.StockDay;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class StockDay_MainApp_m {

	public static void main(String[] args) {
		  String returnmsg_ok = "数据插入成功"; 
		  String returnmsg_err = "已存在数据,没有插入数据";
		  String stocknum = "600303";
		  String gupiaodata = "2016-06-12";
		  ApplicationContext context = new ClassPathXmlApplicationContext("Beans-SQL.xml");
		  StockDayDaoImpl obj = (StockDayDaoImpl) context.getBean("StockDayDao");
		  int  beexist_count = obj.findStockDayByGupiaodata(stocknum, gupiaodata);
		  if(beexist_count > 0){
			  //数据已经存在
			  System.out.println(returnmsg_err );
		  }else{
			  //没有数据 可以插入新数据
			  obj.insertStockDay(stocknum, 100L, 100L, gupiaodata);
			  System.out.println(returnmsg_ok );
		  }
		  
	      
	     

	}

}

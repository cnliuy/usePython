package usePython.springjdbc.sql;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		  ApplicationContext context = new ClassPathXmlApplicationContext("Beans-SQL.xml");
		  StockdataDaoImpl obj = (StockdataDaoImpl) context.getBean("StockdataDao");
	 
	      obj.findsql("");

	}

}

package usePython;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class use_Tushare_data {

	public static void main(String[] args) {
		
		  try{  
		      System.out.println("----start------");  
		      Process pr;
		      //Process pr = Runtime.getRuntime().
		      //	exec("python F:\\python2016\\Python_src\\testsrc\\get_hist_data.py");	
		      //Process pr = Runtime.getRuntime().
		      //    exec("python F:\\python2016\\Python_src\\testsrc\\get_hist_data.py");	
		      //Process pr = Runtime.getRuntime().
		      //	exec("python F:\\Java2016\\jee-mars-space\\usePython\\python_src\\get_hist_data.py");	//600303
		      //Process pr = Runtime.getRuntime().
		      //	exec("python .\\python_src\\get_hist_data.py");	//600303
		      //Process pr = Runtime.getRuntime().
			  //  		exec("python .\\python_src\\get_argvs.py hello world");   //���ղ�������ӡ
		      //Process pr = Runtime.getRuntime().
			  //  		exec("python .\\python_src\\goget_all_today_data.py");   //
		      /**
		       * 
		       * cmd cd F:\\Java2016\\gitspace\\gupiao2\\usePython\\python_src
		       * cmd python  goget_history_detail_data__to_DB.py  600848  2015-08-26
		       *  
		       * */
		      pr = Runtime.getRuntime().
				     	exec("python .\\python_src\\goget_history_detail_data__to_DB.py  300296  2016-06-24");	//600303  time：时间
		      // price：成交价格    change：价格变动    volume：成交手    amount：成交金额(元)   type：买卖类型【买盘、卖盘、中性盘】
		      
		      // create UNIQUE INDEX index_ on tick_data_300296(index)
		      BufferedReader in = new BufferedReader(new InputStreamReader(pr.getInputStream()));  
		      String line;  
		      while ((line = in.readLine()) != null) {
		          System.out.println(line);
		      }
		      in.close();
		      pr.waitFor();
		      System.out.println("----end--------");
	              
	      } catch (Exception e){	    	  
	    	  e.printStackTrace();  
	      }        

	}

}

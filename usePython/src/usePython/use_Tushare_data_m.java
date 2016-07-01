package usePython;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class use_Tushare_data_m {
	
	/**
	 * 获取股票 某日详细数据，写入数据库 
	 * 
	 * */
	public static void main(String[] args) {
		
		String 	stocknum = "300033";  //300296
		String  daystr[] = {"2016-06-23","2016-06-24"};
		String  tmpdaystr = "";
		int operflag = -1 ;
		String errmsg = "------------"+stocknum+"----getdata---err---in----" ;
		for(int i = 0 ; i<daystr.length ; i++){
			tmpdaystr = daystr[i] ;
			operflag = use_Tushare_data_m.GogetOnedayDetailData2DB(stocknum, tmpdaystr);
			if(operflag==-1){
				//erro
				errmsg = errmsg+tmpdaystr; 
				System.out.println(errmsg);
			}else{
				//ok
			}
		}
		
	}
    /**
     * 得到某只股票的某天的全天明细
     * cmd cd F:\\Java2016\\gitspace\\gupiao2\\usePython\\python_src
     * cmd python  goget_history_detail_data__to_DB.py  600848  2015-08-26
     * 
     * @param
     * 	stocknum = "300296";
     *  daystr = "2016-06-24";
     *  
     * @return
     *  flag   -1 失败
     *  		1 ok
     * */
	public static int GogetOnedayDetailData2DB(String stocknum, String daystr) {
		 int flag = -1 ;
		 try{  
		      System.out.println("----start------");  
		      Process pr;
		      String day_detail_data_outlog = "--获取了 "+stocknum+"-- "+daystr+" --的全天详细数据";
		      pr = Runtime.getRuntime().
				     	exec("python .\\python_src\\goget_history_detail_data__to_DB.py  "+stocknum+"  "+daystr+" ");	//600303  time：时间
		      // price：成交价格    change：价格变动    volume：成交手    amount：成交金额(元)   type：买卖类型【买盘、卖盘、中性盘】
		      
		      // create UNIQUE INDEX index_ on tick_data_300296(index)
		      BufferedReader in = new BufferedReader(new InputStreamReader(pr.getInputStream()));  
		      String line;  
		      while ((line = in.readLine()) != null) {
		          System.out.println(line);
		      }
		      in.close();
		      pr.waitFor();
		      flag = 1;
		      System.out.println(day_detail_data_outlog);
		      System.out.println("----end--------");
	              
	      } catch (Exception e){	    	  
	    	  e.printStackTrace();  
	    	  flag = -1;
	      } 
		 
		 return flag ;
		 
	}
	public void old_main(String[] args) {
		
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
		      String stocknum = "300296";
		      String daystr = "2016-06-24";
		      String day_detail_data_outlog = "--获取了 "+stocknum+"-- "+daystr+" --的全天详细数据";
		      pr = Runtime.getRuntime().
				     	exec("python .\\python_src\\goget_history_detail_data__to_DB.py  "+stocknum+"  "+daystr+" ");	//600303  time：时间
		      // price：成交价格    change：价格变动    volume：成交手    amount：成交金额(元)   type：买卖类型【买盘、卖盘、中性盘】
		      
		      // create UNIQUE INDEX index_ on tick_data_300296(index)
		      BufferedReader in = new BufferedReader(new InputStreamReader(pr.getInputStream()));  
		      String line;  
		      while ((line = in.readLine()) != null) {
		          System.out.println(line);
		      }
		      in.close();
		      pr.waitFor();
		      System.out.println(day_detail_data_outlog);
		      System.out.println("----end--------");
	              
	      } catch (Exception e){	    	  
	    	  e.printStackTrace();  
	      }        

	}
	
	
	


}

package usePython;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class use_Tushare_data {

	public static void main(String[] args) {
		
		  try{  
		      System.out.println("----start------");  
		      //Process pr = Runtime.getRuntime().
		      //	exec("python F:\\python2016\\Python_src\\testsrc\\get_hist_data.py");	
		      //Process pr = Runtime.getRuntime().
		      //    exec("python F:\\python2016\\Python_src\\testsrc\\get_hist_data.py");	
		      //Process pr = Runtime.getRuntime().
		      //	exec("python F:\\Java2016\\jee-mars-space\\usePython\\python_src\\get_hist_data.py");	//600303
		      //Process pr = Runtime.getRuntime().
		      //	exec("python .\\python_src\\get_hist_data.py");	//600303
		      //Process pr = Runtime.getRuntime().
			  //  		exec("python .\\python_src\\get_argvs.py hello world");   //接收参数并打印
		      Process pr = Runtime.getRuntime().
			    		exec("python .\\python_src\\goget_all_today_data.py");   //
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

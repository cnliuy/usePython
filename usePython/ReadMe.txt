配置步骤：


	1.配置python环境
	
		安装 Anaconda ( http://www.continuum.io/downloads ),
		一次安装包括了Python环境和全部依赖包.
	
	2.tushare安装
	
		方式1：pip install tushare ( CMD命令行中执行 )
		方式2：访问 https://pypi.python.org/pypi/tushare/ 下载安装
	
	3.java 调用 python
	
		python F:\Java2016\jee-mars-space\usePython\python_src\show_sys_path.py
		
		参考： http://tonl.iteye.com/blog/1918245 ( Java 调用 Python )
		
	4.python 将数据传入数据库中
	
		参考一：http://blog.csdn.net/bxprog/article/details/47806409
		
		"Python 向 DataFrame 添加一列，该列为同一值"
		
		SRC:
				import pandas as pd
				filepath = 'H:\\TestPYTHON\\datapub.csv'
				dataheader = ['A','B','C']
				data_original = pd.read_csv(filepath, sep=',', header=0, names=dataheader, skip_blank_lines=True)
				print data_original
				data_original['D']='ColumnD'
				print data_original
		结果：
				In [4]: %run "H:\TestPYTHON\public.py"
					A   B  C
				0  a1  b1  1
				1  a2  b2  2
				2  a3  b3  3
				    A   B  C   D
				0  a1  b1  1  ColumnD
				1  a2  b2  2  ColumnD
				2  a3  b3  3  ColumnD
				
		参考二：http://www.jianshu.com/p/682c24aef525
		
--EOF--

#from sqlalchemy import create_engine
import sqlalchemy as sa
import tushare as ts
import sys
from astropy.io.ascii.tests.test_fixedwidth import table
#from pip._vendor.pyparsing import tableName

## cmd:	cd  F:\Java2016\gitspace\gupiao2\usePython\python_src\
## cmd: python  goget_history_detail_data__to_DB.py  600848  2015-08-26
gupiaocode = sys.argv[1];
gupiaodata = sys.argv[2];
#print ("gupiaocode:",gupiaocode)
#print ("gupiaodata:",gupiaodata)
## df = ts.get_tick_data('600848',date='2014-01-09')
df = ts.get_tick_data(gupiaocode,date=gupiaodata)


#print ( df.head(10)) 
#print (df)
## use sqlalchemy create DB connect  
#engine = create_engine('mysql://user:passwd@127.0.0.1/db_name?charset=utf8')
#engine = create_engine('postgresql://postgres:ttxs123321@127.0.0.1:14875/pydb0')
engine = sa.create_engine('postgresql://postgres:ttxs123321@127.0.0.1:14875/pydb0')
## save to DB
#df.to_sql('tick_data',engine)
tname123 = 'tick_data_'+gupiaocode;
print ("tablename_123:",tname123)
#df.to_sql(tname123,engine)
df['gupiaodata']=gupiaodata  #增加一列的数据
df.to_sql(tname123,engine)
## if table exeist append to DB
#df.to_sql('tick_data',engine,if_exists='append')
#df.to_sql(tname123,engine,if_exists='append')
df.to_sql(tname123,engine,if_exists='append')
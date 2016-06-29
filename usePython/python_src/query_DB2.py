from sqlalchemy import *
from sqlalchemy.orm import *
import sys
# 计算 买卖盘 的数据 差   ---在用  be used
#  python  query_DB2.py   600303   2016-06-24
#   300296   2016-06-27
DB_CONNECT_STRING = 'postgresql://postgres:ttxs123321@127.0.0.1:14875/pydb0'
mysql_engine = create_engine(DB_CONNECT_STRING, echo=True)
connection = mysql_engine.connect()

gupiaocode = sys.argv[1];
gupiaodata = sys.argv[2];


buy1num = 0
sell2num = 0

result = connection.execute("SELECT sum(amount) FROM tick_data_"+gupiaocode+" where amount > 100000  and type='买盘' and gupiaodata='"+gupiaodata+"' ")
for row in result:
    buy1num = row['sum']
    #print ("sum: ", row['sum'])
#print (result1num)

result2 = connection.execute("SELECT sum(amount) FROM tick_data_"+gupiaocode+" where amount > 100000  and type='卖盘' and gupiaodata='"+gupiaodata+"'")
for row in result:
    sell2num = row['sum']
#print ('result2num'+result2num)

cha = buy1num - sell2num
print (cha)

connection.close()
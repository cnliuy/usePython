from sqlalchemy import *
from sqlalchemy.orm import *

# 计算 买卖盘 的数据 差   ---在用  be used

DB_CONNECT_STRING = 'postgresql://postgres:ttxs123321@127.0.0.1:14875/pydb0'
mysql_engine = create_engine(DB_CONNECT_STRING, echo=True)
connection = mysql_engine.connect()

result1num = 0
result2num = 0

result = connection.execute("SELECT sum(amount) FROM tick_data_300296 where amount > 100000  and type='买盘' ")
for row in result:
    result1num = row['sum']
    #print ("sum: ", row['sum'])
#print (result1num)

result2 = connection.execute("SELECT sum(amount) FROM tick_data_300296 where amount > 100000  and type='卖盘' ")
for row in result:
    result2num = row['sum']
#print ('result2num'+result2num)

cha = result1num-result2num
print (cha)

connection.close()
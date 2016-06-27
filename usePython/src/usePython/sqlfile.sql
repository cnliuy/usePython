SELECT index, "time", price, change, volume, amount, type, gupiaodata
  FROM tick_data_300296 where amount > 100000  and type='买盘';
  
SELECT sum(amount) 
  FROM tick_data_300296 where amount > 100000  and type='买盘'; #137,998,328
  
SELECT sum(amount) 
  FROM tick_data_300296 where amount > 100000  and type='卖盘'; #161,949,058
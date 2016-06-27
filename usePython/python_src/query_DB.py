from sqlalchemy import create_engine
from sqlalchemy.orm import sessionmaker

from sqlalchemy import *
from sqlclchemy.orm import *

DB_CONNECT_STRING = 'postgresql://postgres:ttxs123321@127.0.0.1:14875/pydb0'
engine = create_engine(DB_CONNECT_STRING, echo=True)
Session = sessionmaker(bind=engine)

session = Session()
session.execute('show databases')
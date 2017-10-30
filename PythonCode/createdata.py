#!/usr/bin/python
# encoding: utf-8   
""" 
@version: v1.0 
@author: madongmei  
@contact: 1781377066@qq.com 
@file: createdata.py 
@time: 2017/9/8 22:49 
"""


import time
import logging
from logging.handlers import RotatingFileHandler
import random
import MySQLdb


info_dict={0:"common op",1:"warning op",2:"danger op"}
level_list=[0,1,2]

rt_file_handler=RotatingFileHandler("createdata.log", maxBytes=10*1024*1024, backupCount=5)
rt_file_handler.setLevel(logging.DEBUG)
formatter=logging.Formatter('%(asctime)s %(filename)s[line:%(lineno)d] %(levelname)s %(message)s')
rt_file_handler.setFormatter(formatter)
logger=logging.getLogger()
logger.addHandler(rt_file_handler)
logger.setLevel(logging.DEBUG)

dt = time.strftime("%Y%m%d%H", time.localtime(time.time()))


def connect_db():
    conn = MySQLdb.connect(
        host='localhost',
        port=3306,
        user='root',
        passwd='root',
        db='test',
    )
    return conn

def update_db():
    try:
        conn=connect_db()
        cursor=conn.cursor(MySQLdb.cursors.DictCursor)
        level=random.sample(level_list,1)[0]
        info=info_dict[level]
        value=[dt,level,info]
        sql="insert into alarm_log(ds, level, info) values(%s,%s,%s)"
        cursor.execute(sql,value)
        conn.commit()
    except Exception, e:
        logging.error("Insert Error %s",e.args[0])
        conn.rollback()

    cursor.close()
    conn.close()

def main():
    update_db()

if __name__ == '__main__':
    print dt
    main()

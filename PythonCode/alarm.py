#!/usr/bin/env python  
# encoding: utf-8   
""" 
@version: v1.0 
@author: madongmei  
@contact: 1781377066@qq.com 
@file: alarm.py 
@time: 2017/9/8 10:15 
"""
import MySQLdb
import time
import logging



logging.basicConfig(level=logging.DEBUG,
                format='%(asctime)s %(filename)s[line:%(lineno)d] %(levelname)s %(message)s',
                datefmt='%a, %d %b %Y %H:%M:%S',
                filename='alarm.log',
                filemode='w')
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
        cursor=conn.cursor()
        sql=("insert into alarm_log(ds, level, info) values(%s, 1, 'warning op')" %(dt))
        cursor.execute(sql)
        conn.commit()
    except Exception, e:
        logging.error("Mysql Error %s",e.args[0])
        conn.rollback()

    cursor.close()
    conn.close()




def main():
    update_db()

if __name__ == '__main__':
    print dt
    main()

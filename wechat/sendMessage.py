#!/usr/bin/python
# encoding: utf-8
""" 
@version: v1.0
@author: madongmei
@contact: 1781377066@qq.com
@file: sendMessage.py
@time: 2017/10/23 11:43
"""
import sys
import logging
from logging.handlers import RotatingFileHandler
import json
import requests
import MySQLdb
import time
import datetime

reload(sys)
sys.setdefaultencoding('utf8')

APPID = 'wx18862d70a1b81b27'
SECRET = '1f3e6119fd1f5f8aed5fbb75beb675c1'
OPENID = 'oi9jY0gGdx0_JauMDnvTRNri3vWU'


rt_file_handler=RotatingFileHandler("sendMessage.log", maxBytes=10*1024*1024, backupCount=5)
rt_file_handler.setLevel(logging.DEBUG)
formatter=logging.Formatter('%(asctime)s %(filename)s[line:%(lineno)d] %(levelname)s %(message)s')
rt_file_handler.setFormatter(formatter)
logger=logging.getLogger()
logger.addHandler(rt_file_handler)
logger.setLevel(logging.DEBUG)

dt = ((datetime.datetime.now()-datetime.timedelta(hours=1)).strftime("%Y%m%d%H"))
#dt = time.strftime("%Y%m%d%H", time.localtime(time.time()))

def connect_db():
    conn = MySQLdb.connect(
        host='localhost',
        port=3306,
        user='root',
        passwd='root',
        db='test',
    )
    return conn


def getToken():
    paras = {'appid': APPID,'secret': SECRET}
    r = requests.get('https://api.weixin.qq.com/cgi-bin/token?grant_type=client_credential',
                     params=paras)
    res = json.loads(r.text)
    TOKEN = res['access_token']
    return TOKEN

def sendMsg():
    msg = getContent()
    if msg is None:
        logger.info("no danger info")
        return
    payload = {
        "touser":OPENID,
        "msgtype":"text",
        "text":
        {
            "content":msg
        }
    }
    TOKEN = getToken()
    r = requests.post('https://api.weixin.qq.com/cgi-bin/message/custom/send?access_token='+TOKEN,
                      data=json.dumps(payload))
    print r.text

def getDangerOP():
    msg = ''
    try:
        conn=connect_db()
        cursor=conn.cursor()
        sql=("select count(*),info from alarm_log where level>=1 and ds=%s group by info" %(str(dt)))
        logger.info(sql)
        cursor.execute(sql)
        results = cursor.fetchall()
        if len(results)>0:
            for row in results:
                level = str(row[0])
                info = str(row[1])
                msg = u'%s 操作级别: %s, 告警信息: %s\n\n' %(msg, level, info)
        else:
            return None
        conn.commit()
    except Exception, e:
        logger.error("Mysql Error %s",e.args[0])
        conn.rollback()
    
    cursor.close()
    conn.close()
    return msg.encode("utf-8")

def getContent():
    info = getDangerOP()
    if info is None:
        return None
    msg = u'时间: %s\n %s' %(str(dt), info)
    logger.info(msg)
    return msg.encode('utf-8')


def main():
    sendMsg()


if __name__ == '__main__':
    main()
    

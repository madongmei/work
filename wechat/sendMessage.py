#!/usr/bin/python
# encoding: utf-8
""" 
@version: v1.0
@author: madongmei
@contact: 1781377066@qq.com
@file: sendMessage.py
@time: 2017/10/23 11:43
"""

import logging
import json
import requests
import MySQLdb
import time

APPID = 'wx18862d70a1b81b27'
SECRET = '1f3e6119fd1f5f8aed5fbb75beb675c1'
OPENID = 'oi9jY0gGdx0_JauMDnvTRNri3vWU'


logging.basicConfig(level=logging.DEBUG,
                format='%(asctime)s %(filename)s[line:%(lineno)d] %(levelname)s %(message)s',
                datefmt='%a, %d %b %Y %H:%M:%S',
                filename='sendMessage.log',
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


def getToken():
    paras = {'appid': APPID,'secret': SECRET}
    r = requests.get('https://api.weixin.qq.com/cgi-bin/token?grant_type=client_credential',
                     params=paras)
    res = json.loads(r.text)
    TOKEN = res['access_token']
    return TOKEN

def sendMsg():
    payload = {
        "touser":OPENID,
        "msgtype":"text",
        "text":
        {
            "content":getContent()
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
        sql=("select count(level), info from alarm_log where ds=%s group by level" %(2017090811))
        logging.info(sql)
        cursor.execute(sql)
        results = cursor.fetchall()
        for row in results:
            level = str(row[0])
            info = str(row[1])
            msg = msg + '操作级别:' + level + ', ' + '警告信息:' + info +'\n'
        conn.commit()
    except Exception, e:
        logging.error("Mysql Error %s",e.args[0])
        conn.rollback()
    
    cursor.close()
    conn.close()
    return msg

def getContent():
    msg = '时间：' + str(dt) + "\n" + getDangerOP()
    logging.info(msg)
    return msg


def main():
    sendMsg()


if __name__ == '__main__':
    main()
    

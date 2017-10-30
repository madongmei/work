#!/usr/bin/python
# encoding: utf-8
""" 
@version: v1.0
@author: madongmei
@contact: 1781377066@qq.com
@file: login.py
@time: 2017/10/22 11:43
"""

import logging
from logging.handlers import RotatingFileHandler
import json
import requests
from wxpy import *
from wechat_sender import *

rt_file_handler = RotatingFileHandler("./login.log", maxBytes=10*1024*1024, backupCount=5)
rt_file_handler.setLevel(logging.DEBUG)
formatter = logging.Formatter('%(asctime)s %(filename)s[line:%(lineno)d] %(levelname)s %(message)s')
rt_file_handler.setFormatter(formatter)
logger = logging.getLogger()
logger.addHandler(rt_file_handler)
logger.setLevel(logging.DEBUG)


bot = Bot(console_qr=True, login_callback=True)
bot.enable_puid()
my = bot.friends().search('Mei')[0]

payload = {'appid': 'wx18862d70a1b81b27','secret': '1f3e6119fd1f5f8aed5fbb75beb675c1'}
r = requests.get('https://api.weixin.qq.com/cgi-bin/token?grant_type=client_credential',
                 params=payload)
logger.info(r.text)
res = json.loads(r.text)
#TOKEN = res['access_token']
TOKEN = 'h3i39pasNMge2sMq4s3gSb_IvWjs_nuu93IIVBXmTlgIWoDN-pXWtvEhDUDcT6faAQ0BaD0jiGS-4YOpqQjy6Fq5DYVA1zNeRxMzaDqVydBiDHx5uNfajvCMzANGbCEaUNRhAGAQJN'

listen(bot, receivers=my, token=TOKEN, port=10245, status_report=True, status_receiver=my)
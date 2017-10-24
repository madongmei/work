#!/usr/bin/python
# encoding: utf-8
""" 
@version: v1.0
@author: madongmei
@contact: 1781377066@qq.com
@file: login.py
@time: 2017/10/22 11:43
"""


from wechat_sender import Sender
sender=Sender(token='h3i39pasNMge2sMq4s3gSb_IvWjs_nuu93IIVBXmTlgIWoDN-pXWtvEhDUDcT6faAQ0BaD0jiGS-4YOpqQjy6Fq5DYVA1zNeRxMzaDqVydBiDHx5uNfajvCMzANGbCEaUNRhAGAQJN',
                     receivers='Mei', host=u'http://47.94.222.71', port=10245)
Sender().send('Hello From Wechat Sender')


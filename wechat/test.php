<?php
$post_data = array( "touser"=>array('oi9jY0gGdx0_JauMDnvTRNri3vWU', 'OpenID2'), 
//把OpenID替换成第4步获取到的加密微信号注意这里至少要两个OpenID，否则会返回错误信息。如果只有一个账号关注了的话，可以自己再随便造一个，或两个OpenID写成一样
          "msgtype"=> "text",
          "text" => array( "content" => "I am msg.") 
      ); 
$post_data = json_encode($post_data) ;
  
//因为API只接受json的格式的数据，所以要进行json encode,当然，以上的代码也可直接写成下面这样:
//$postdata = '{"touser":["OpenID1","OpenID2"],"msgtype":"text","text":{"content":"I am msg."}}';


$url='https://api.weixin.qq.com/cgi-bin/message/mass/send?access_token=h3i39pasNMge2sMq4s3gSb_IvWjs_nuu93IIVBXmTlgIWoDN-pXWtvEhDUDcT6faAQ0BaD0jiGS-4YOpqQjy6Fq5DYVA1zNeRxMzaDqVydBiDHx5uNfajvCMzANGbCEaUNRhAGAQJN';
//把ACCESS_TOKEN替换成第3步获取到的token
  
$ch = curl_init(); 
curl_setopt($ch, CURLOPT_POST, 1); 
curl_setopt($ch, CURLOPT_URL,$url); 
curl_setopt($ch, CURLOPT_POSTFIELDS, $p); 
curl_setopt($ch, CURLOPT_RETURNTRANSFER, 1);
curl_setopt($ch, CURLOPT_SSL_VERIFYPEER, FALSE);
curl_setopt($ch, CURLOPT_SSL_VERIFYHOST, FALSE);
//上面两行是为了解决https证书问题，不加的话会报错，所以直接信任证书了。
$result=curl_exec($ch); 
echo curl_error($ch);
curl_close($ch);
print_r($result);

?>

package com.madongmei.myblog.util;

import org.apache.velocity.runtime.directive.Parse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.vladsch.flexmark.ast.Node;
import com.vladsch.flexmark.html.HtmlRenderer;
import com.vladsch.flexmark.parser.Parser;
import com.vladsch.flexmark.util.options.MutableDataSet;
import java.security.MessageDigest;

/**
 * Created by laxe on 2018/1/3.
 */
public class MyBlogUtil {
    private static final Logger logger= LoggerFactory.getLogger(MyBlogUtil.class);

    /**
     * MD5加密
     * */
    public static String MD5(String key){
        char hexDigitals[]={'0','1','2','3','4','5','6','7',
                            '8','9','A','B','C','D','E','F'};

        try{
            byte[] btInput=key.getBytes();
            MessageDigest mdInst=MessageDigest.getInstance("MD5");
            mdInst.update(btInput);
            byte[] md=mdInst.digest();
            int j=md.length;
            char[] str=new char[j*2];
            int k=0;
            for(int i=0;i<j;i++){
                byte b=md[i];
                str[k++]=hexDigitals[b >>> 4 & 0xf];
                str[k++]=hexDigitals[b & 0xf];
            }
            return new String(str);
        }catch(Exception e){
            logger.error("生成MD5失败",e);
            return null;
        }
    }

    public static String transfer(String content){
        MutableDataSet options=new MutableDataSet();
        Parser parser= Parser.builder(options).build();
        HtmlRenderer renderer=HtmlRenderer.builder(options).build();
        Node document=parser.parse(content);
        return renderer.render(document);
    }
}

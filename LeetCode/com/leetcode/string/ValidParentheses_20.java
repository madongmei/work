package com.leetcode.string;

import java.util.Vector;

/**
 * @author Demetria
 * ˼������˵���������ջ��˼�룬��ʵ����û��Ҫ�ǵ���ԭ��ջ��pop��push�����Լ�д������ջ�����ݽṹ���ࡣ
 * ��ʵStringBuilder�Ϳ���ʵ��ջ��˼�롣
 * StringBuilder�൱��һ��ջ��StringBuilder sb=new StringBuilder();
 * ��ջ��sb.append(char ch);
 * ��ջ��sb.deleteCharAt(sb.charAt(sb.length()-1));
 * 
 *
 */
public class ValidParentheses_20{

	
	public static void main(String args[]){
//		String s="[{}]({}[]){}";
		String s="([)]";
		System.out.println(isValid(s));
	}
	
	public static boolean isValid(String s) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
        	char ch=s.charAt(i);
        	if(sb.length()==0 || !match(sb.charAt(sb.length()-1),ch)){
        		sb.append(ch);
        	}else{
        		sb.deleteCharAt(sb.length()-1);
        	}
        }
        if(sb.length()!=0){
        	return false;
        }else{
        	return true;
        }
    }
	
	public static boolean match(char ch1,char ch2){
		if((ch1=='(' && ch2==')') || (ch1=='[' && ch2==']') || (ch1=='{' && ch2=='}'))
			return true;
		else
			return false;
	}
}

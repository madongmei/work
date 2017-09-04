package com.leetcode.string;

import java.util.Vector;

/**
 * @author Demetria
 * 思考：据说这题可以用栈的思想，其实我们没必要非得用原生栈的pop和push，即自己写个定义栈的数据结构的类。
 * 其实StringBuilder就可以实现栈的思想。
 * StringBuilder相当于一个栈；StringBuilder sb=new StringBuilder();
 * 进栈：sb.append(char ch);
 * 出栈：sb.deleteCharAt(sb.charAt(sb.length()-1));
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

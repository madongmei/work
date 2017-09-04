package com.leetcode.string;

/**
 * @author Demetria
 * Ŷ����һ���ַ����Ƿ�Ϊ���ģ��ַ�������Ҫ��������
 * ֻ������ĸ�����֣����Դ�ʱҪ��������ʽ���ַ������д���
 * ���ﻹ�õ���StringBulider��reverse������
 */
public class ValidPalindrome_125 {
	
	public static void main(String args[]){
		String s="Damosela poem? A carol? Or a cameo pale? (So mad!)";
		System.out.println(isPalindrome(s));
	}
	
	
	public static boolean isPalindrome(String s) {
		if(s.length()==0)
			return true;
		
		String str=s.replaceAll("[^A-Za-z0-9]", "");
//		System.out.println(str);
	    StringBuilder sb=new StringBuilder();
	    sb.append(str);
	    String temp=sb.toString();
	    String str2=sb.reverse().toString().toLowerCase();
	    String str3=temp.toLowerCase();
	    
	    if(str2.equals(str3)){
	    	return true;
	    }else{
	    	return false;
	    } 
	}
}

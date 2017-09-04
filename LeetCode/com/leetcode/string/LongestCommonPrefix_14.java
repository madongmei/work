package com.leetcode.string;

/**
 * @author Demetria
 * 本题是关于字符串型数组中最长公共字串的问题
 */
public class LongestCommonPrefix_14 {

	public static void main(String args[]){
		
		String[] strs={"a"};
		System.out.println(longestCommonPrefix(strs));
	}
	
	public static String longestCommonPrefix(String[] strs) {
		
		if(strs.length==0){
			return "";
		}else if(strs.length==1){
			return strs[0];
		}
		
		String temp=strs[0];
		String com="";
       for(int i=1;i<strs.length;i++){
    	   com=getCommonPrefix(temp, strs[i]);
    	   if(com.equals("")){
    		   return "";
    	   }else{
    		   temp=com;
    	   }
       }
       return com;
    }
	
	public static String getCommonPrefix(String str1,String str2){
		if(str1.length()==0 || str2.length()==0)
			return "";
		if(str1.indexOf(str2)==0){
			return str2;
		}
		if(str2.indexOf(str1)==0){
			return str1;
		}
		
		int len=str1.length()>str2.length()?str2.length():str1.length();
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<len;i++){
			if(str1.charAt(i)==str2.charAt(i)){
				sb.append(str1.charAt(i));
			}
			else
				break;
		}
		
		return sb.toString();
	}
}

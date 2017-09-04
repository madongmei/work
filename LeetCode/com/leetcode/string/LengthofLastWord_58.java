package com.leetcode.string;

/**
 * @author Demetria
 * 主要考察split函数的使用，另外需要注意s是否只包含空格，这时候需要用s.trim().isEmpty()做处理。
 */
public class LengthofLastWord_58 {

	public static void main(String args[]){
		String s="heloocjk  skncsdkjc   sakncjsn    alksksn    lkscjsn     ";
		int len=lengthOfLastWord(s);
		System.out.println(len);
	} 
	
	public static int lengthOfLastWord(String s) {
		  if(s.length()==0 || s.trim().isEmpty())
			  return 0;
		  String[] strs=s.split(" ");
		  if(strs[strs.length-1].length()==0){
			  return 0;
		  }else{
			  return strs[strs.length-1].length();
		  }
	}
}

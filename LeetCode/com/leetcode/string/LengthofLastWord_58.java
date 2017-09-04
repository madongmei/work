package com.leetcode.string;

/**
 * @author Demetria
 * ��Ҫ����split������ʹ�ã�������Ҫע��s�Ƿ�ֻ�����ո���ʱ����Ҫ��s.trim().isEmpty()������
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

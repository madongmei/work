package com.leetcode.string;

/**
 * @author Demetria
 * note:������ǿ���һ���ַ����Ƿ�Ϊ��һ���ַ������Ӵ�������ǵĻ���������λ�á�������Ƿ���0.
 * ֱ���ú���indexOf(String substr)����
 */
public class ImplementstrStr_28 {

	public static void main(String args[]){
		String str="hello";
		String substr="loooo";
		System.out.println(strStr(str,substr));
	}
	
	public static int strStr(String haystack, String needle) {
       return haystack.indexOf(needle); 
    }
	
}

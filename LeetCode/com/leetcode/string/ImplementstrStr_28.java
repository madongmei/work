package com.leetcode.string;

/**
 * @author Demetria
 * note:本题就是考察一个字符串是否为另一个字符串的子串，如果是的话返回索引位置。如果不是返回0.
 * 直接用函数indexOf(String substr)即可
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

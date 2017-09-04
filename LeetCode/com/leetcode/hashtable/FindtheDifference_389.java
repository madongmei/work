package com.leetcode.hashtable;

import java.util.HashMap;

public class FindtheDifference_389 {

	public static void main(String args[]){
		String s="olhelloopopo";
		String t="ollwphe";
		System.out.println(findTheDifference(s, t));
	}
	
	public static char findTheDifference(String s, String t) {
		String str = s + t;
		char letter=str.charAt(0);
		for (int j = 1; j < str.length(); j++) {
		letter^=str.charAt(j);
		}
		return letter;
    }
}

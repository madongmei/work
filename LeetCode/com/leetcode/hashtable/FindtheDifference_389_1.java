package com.leetcode.hashtable;

import java.util.HashMap;

/**
 * @author Demetria
 * 题意：这个题目的意思是，字符串t是由字符串s打乱顺序后再随便加上一个字符构成的，
 * 现在就是要找这个随便加上的字符。
 */
public class FindtheDifference_389_1 {

	
	public static void main(String args[]){
		String s="lllowphe";
		String t="ollwphe";
		System.out.println(findTheDifference(s, t));
	}
	
	public static char findTheDifference(String s, String t) {
		HashMap<Character,Integer> map1=new HashMap<Character ,Integer>();
		HashMap<Character,Integer> map2=new HashMap<Character ,Integer>();
		
		for(int i=0;i<s.length();i++){
			int count=0;
			char ch=s.charAt(i);
			if(!map1.containsKey(ch)){
				map1.put(ch, count);
			}else{
				count=map1.get(ch)+1;
				map1.put(ch,count);
			}
		}
		
		for(int j=0;j<t.length();j++){
			int count=0;
			char ch=t.charAt(j);
			if(!map2.containsKey(ch)){
				map2.put(ch, count);
			}else{
				count=map2.get(ch)+1;
				map2.put(ch,count);
			}
		}
		
		
		for(int i=0;i<t.length();i++){
			char ch=t.charAt(i);
			if(map1.get(ch)!=map2.get(ch)){
				return ch;
			}
		}
		return 0;
    }
}

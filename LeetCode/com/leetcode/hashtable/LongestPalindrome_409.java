package com.leetcode.hashtable;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @author Demetria
 * 题意：找出一个字符串中可以组合成回文的最长长度，返回最长长度。大小写敏感
 * 使用map来找到所有字符的个数，看每个字符的个数。
 */
public class LongestPalindrome_409 {

	public static void main(String args[]){
		String s="adbfgh";
		System.out.println(longestPalindrome(s));
	}
	
	public static int longestPalindrome(String s) {
        Map<Character,Integer> map=new HashMap<Character, Integer>();
        for(int i=0;i<s.length();i++){
        	int count=1;
        	if(map.containsKey(s.charAt(i))){
        		count=map.get(s.charAt(i))+1;
        	}
        	map.put(s.charAt(i), count);
        }
        int len=0;
        int flag=0;
        int flag1=0;
        Set<Character> set=map.keySet();
        Iterator<Character> it=set.iterator();
        while(it.hasNext()){
        	char ch=it.next();
        	if(map.get(ch)>1){
        		if(map.get(ch)%2==0)
        			len=len+map.get(ch)/2;
        		else{
        			len=len+map.get(ch)/2;
        			flag=1;
        		}
        	}else{
        		flag1=1;
        	}
        }
        len=len*2;
        if(flag==1 || flag1==1)
        	len=len+1;
        
        return len;
    }
}

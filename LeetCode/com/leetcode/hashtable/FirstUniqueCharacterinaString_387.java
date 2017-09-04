package com.leetcode.hashtable;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

/**
 * @author Demetria
 * 题意:找出字符串中第一个不重复存在的字符，
 * 这个题目要用LinkedHashMap,因为这个集合是按照put顺序存储元素的。
 * 这样保证了字符串字符的原有顺序。
 */
public class FirstUniqueCharacterinaString_387 {

	public static void main(String args[]){
		String s="x";
		System.out.println(firstUniqChar(s));
	}
	
	public static int firstUniqChar(String s) {
		if(s.length()==1)
			return 0;
		
		LinkedHashMap<Character,Integer> map=new LinkedHashMap<Character, Integer>();
        for(int i=0;i<s.length();i++){
        	int count=1;
        	if(map.containsKey(s.charAt(i)))
        		count=map.get(s.charAt(i))+1;
        	map.put(s.charAt(i), count);
        }
        System.out.println(map);
        Set<Character> set=map.keySet();
        Iterator<Character> it=set.iterator();
        char key=0;
        while(it.hasNext()){
        	char ch=it.next();
        	if(map.get(ch)==1 && map.size()!=1){
        		System.out.println(ch);
        		key=ch;
        		break;
        	}
        }
        return s.indexOf(key);
    }
}

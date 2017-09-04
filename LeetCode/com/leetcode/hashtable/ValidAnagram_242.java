package com.leetcode.hashtable;

import java.util.ArrayList;
import java.util.List;

public class ValidAnagram_242 {

	public static void main(String args[]){
		String s="cat";
		String t="ear";
		System.out.println(isAnagram(s, t));
	}
	
	public static boolean isAnagram(String s, String t) {
		if(s.length()!=t.length())
			return false;
        List<Character> list=new ArrayList<Character>();
        for(int i=0;i<s.length();i++){
        	list.add(s.charAt(i));
        }
        
        for(int i=0;i<t.length();i++){
        	if(list.contains(t.charAt(i)))
        		list.remove(new Character(t.charAt(i)));
        }
        
        if(list.size()==0)
        	return true;
        else
        	return false;
    }
	
}

package com.leetcode.hashtable;

import java.util.ArrayList;

/**
 * @author Demetria
 *删除list中的元素时，如果有多个相同的元素，，那么只会删除第一个。
 */
public class Test {
	
	public static void main(String args[]){
	
		ArrayList al=new ArrayList();
		al.add("hello");
		al.add("world");
		al.add("hello");
		al.add("hello");
		
		al.remove("hello");
		System.out.println(al.toString());
	}
	
	
}

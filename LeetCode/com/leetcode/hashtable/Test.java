package com.leetcode.hashtable;

import java.util.ArrayList;

/**
 * @author Demetria
 *ɾ��list�е�Ԫ��ʱ������ж����ͬ��Ԫ�أ�����ôֻ��ɾ����һ����
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

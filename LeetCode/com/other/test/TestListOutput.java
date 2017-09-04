package com.other.test;

import java.util.ArrayList;
import java.util.List;

public class TestListOutput {
	
	public static void main(String args[]){
		List<String> list = new ArrayList<String>();
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");
		System.out.println(list.toString());
		
	}
}

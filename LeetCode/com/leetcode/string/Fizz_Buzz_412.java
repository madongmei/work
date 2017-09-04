package com.leetcode.string;

import java.util.ArrayList;
import java.util.List;

public class Fizz_Buzz_412 {
	
	public static void main(String args[]){
		int n=0;
		List<String> list=new ArrayList<String>();
		list=fizzBuzz(n);
		System.out.println(list.toString());
	}
	
	public static List<String> fizzBuzz(int n) {
        List<String> list=new ArrayList<String>();
        for(int i=1;i<=n;i++){
        	if(i%15==0){
        		list.add("FizzBuzz");
        		continue;
        	}
        	else if(i%5==0){
        		list.add("Buzz");
        		continue;
        	}
        	else if(i%3==0){
        		list.add("Fizz");
        		continue;
        	}
        	else{
        		list.add(i+"");
        	}
        }
        return list;
    }
}

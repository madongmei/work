package com.leetcode.math;

import java.util.ArrayList;
import java.util.List;


public class UglyNumber_263 {

	public static void main(String args[]){
		int num=14;
		System.out.println(isUgly(num));
	}
	//³¬Ê±
	public static boolean isUgly1(int num) {
		if(num==1 || num==2 || num==3 || num==5){
			return true;
		}
		
		if(isPrime(num))
			return false;
		
		if(num==Integer.MIN_VALUE)
			return false;
		
		List<Integer> list=new ArrayList<Integer>();
		
        for(int i=2;i<Math.abs(num)/2;i++){
        	if(num%i==0){
        		if(isPrime(i)){
        			if(!list.contains(new Integer(i))){
        				if(num<0)
        					list.add(-i);
        				list.add(i);
        		}
        		
        		if(isPrime(num/i)){
        			if(!list.contains(new Integer(num/i)))
        				if(num<0)
        					list.add(-num/i);
        				list.add(num/i);
        		}
        		}
        	}
        }
        for(int i=0;i<list.size();i++){
        	if(list.get(i)!=2 && list.get(i)!=3 && list.get(i)!=5){
        		return false;
        	}
        }
        return true;
    }

	private static boolean isPrime(int n) {
		for(int i=2;i<=Math.abs(n/2);i++){
			if(n%i==0)
				return false;
		}
		return true;
	}
	
	public static boolean isUgly(int num) {
		if (num == 0) return false;
	    if(num == 1)return true;       
	    return factorize(num);
	}
	
	private static boolean factorize(int num){
	    if(num == 1) return true;
	    if(num % 5 == 0){
	        num = num/5;
	        return factorize(num);
	    }else if(num % 3 == 0){
	        num = num/3;
	        return factorize(num);
	    }else if(num % 2 == 0){
	        num = num/2;
	        return factorize(num);
	    }
	    return false;
	}
}

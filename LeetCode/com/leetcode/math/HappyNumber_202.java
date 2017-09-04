package com.leetcode.math;

public class HappyNumber_202 {

	public static void main(String args[]){
		int n=90;
		System.out.println(isHappy(n));
	}
	
	public static boolean isHappy(int n) {
		if(n==1)
			return true;
		
		if(n==4)
			return false;
		
    	int sum=0;
    	while(n!=0){
    		sum+=(n%10)*(n%10);
    		n=n/10;
    	}
    	
    	return isHappy(sum);
        
    }
}

package com.leetcode.math;

public class CopyOfPowerofTwo_231 {

	public static void main(String args[]){
		int n=12;
		System.out.println(isPowerOfThree(n));
	}
	
	public static boolean isPowerOfThree(int n) {
        while(n>=2){
        	if(n%2==0)
        		n=n/2;
        	else
        		return false;
        }
        
        if(n==1)
        	return true;
        else
        	return false;
    }
}

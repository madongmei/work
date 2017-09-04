package com.leetcode.bit;

public class Power_of_Four_342 {

	public static void main(String args[]){
		int num=20;
		System.out.println(isPowerOfFour(num));
	}
	
	public static boolean isPowerOfFour(int num) {
		if(num>1 && num%4!=0)
			return false;
		
        while(num>1){
        	num=num>>2;
        	if(num%4!=0)
        		return false;
        }
        
        if(num==1)
        	return true;
        else
        	return false;
    }
}

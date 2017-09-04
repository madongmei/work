package com.leetcode.bit;

public class Numberof1Bits_191 {

	public static void main(String args[]){
		int n=11;
		System.out.println(hammingWeight(n));
	}
	
	// you need to treat n as an unsigned value
    public static int hammingWeight(int n) {
        String str=Integer.toBinaryString(n);
        int count=0;
        for(int i=0;i<str.length();i++){
        	if(str.charAt(i)=='1')
        		count++;
        }
        return count;
    }
}

package com.leetcode.string;

public class RomantoInteger_13 {

	public static void main(String args[]){
		String s="MMMDLXXXVI";
		System.out.println(romanToInt(s));
	}
	
	public static int romanToInt(String s) {
		if(s.length()==0){
			return 0;
		}
		int sum=0;
		int temp=0;
        for(int i=0;i<s.length()-1;i++){
        	temp=getNum(s.charAt(i));
        	if(temp>=getNum(s.charAt(i+1))){
        		sum=temp+sum;
//        		System.out.println(sum);
        	}
        	else{
        		sum=sum-temp;
//        		System.out.println(sum);
        	}
        }
        sum=sum+getNum(s.charAt(s.length()-1));
        return sum;
    }
	public static int getNum(char ch){
		if(ch=='I')
			return 1;
		else if(ch=='X')
			return 10;
		else if(ch=='C')
			return 100;
		else if(ch=='M')
			return 1000;
		else if(ch=='V')
			return 5;
		else if(ch=='L')
			return 50;
		else if(ch=='D')
			return 500;
		else
			return 0;
	}
}

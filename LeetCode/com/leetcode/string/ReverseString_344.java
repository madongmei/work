package com.leetcode.string;

public class ReverseString_344 {

	public static void main(String args[]){
//		String s="Hello";
		String s="Hello World";
		System.out.println(reverseString(s));
	}
	
	public static String reverseString(String s) {
		char[] arr=s.toCharArray();
        int low=0;
        int high=s.length()-1;
        while(low<high){
        	char temp=arr[low];
        	arr[low]=arr[high];
        	arr[high]=temp;
        	low++;
        	high--;
        }
        return new String(arr,0,arr.length);
    }
}

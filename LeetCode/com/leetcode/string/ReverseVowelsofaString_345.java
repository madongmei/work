package com.leetcode.string;

public class ReverseVowelsofaString_345 {

	public static void main(String args[]){
//		String s="hello";
		String s="Aa";
//		System.out.println(s);
		System.out.println(reverseVowels(s));
	}
	
	public static String reverseVowels(String s) {
        char[] arr=s.toCharArray();
        int low=0;
        int high=arr.length-1;
        
        while(low<high){
        	if(isVowel(arr[low])){
        		if(isVowel(arr[high])){
        			char temp=arr[low];
        			arr[low]=arr[high];
        			arr[high]=temp;
        			low++;
        			high--;
        		}else{
        			high--;
        		}
        	}
        	else{
        		low++;
        	}
        }
        return new String(arr, 0, arr.length);
    }
	
	public static boolean isVowel(char ch){
		if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'){
			return true;
		}else{
			return false;
		}
	}
}

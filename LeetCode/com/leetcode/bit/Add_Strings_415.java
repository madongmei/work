package com.leetcode.bit;

public class Add_Strings_415 {

	public static void main(String args[]){
		String num1="9";
		String num2="99";
		System.out.println(addStrings(num1,num2));
	}
	
	public static String addStrings(String num1, String num2) {
        if(num1.length()>num2.length()){
        	return getTempString(num1, num2);
        }else{
        	return getTempString(num2, num1);
        }
    }
	
	
	public static String getTempString(String num1, String num2){
			int len1=num1.length()-1;
	        int len2=num2.length()-1;
			StringBuffer sb=new StringBuffer();
			int carry=0;
			int sum=0;
			while(len1>=0){
				if(len2>=0){
					sum=num1.charAt(len1)-'0'+num2.charAt(len2)-'0'+carry;
				}
				else{
					sum=num1.charAt(len1)-'0'+carry;
				}
	        	if(sum>=10){
	        		carry=sum/10;
	        		int temp=sum%10;
	        		sb.append(temp);
	        	}else{
	        		sb.append(sum);
	        		carry=0;
	        	}
	        	
        		len1--;
        		len2--;
	        }
			if(carry>0)
				sb.append(carry);
			return sb.reverse().toString();
	}
}

package com.leetcode.math;

/**
 * @author Demetria
 * 题意：纯数学问题，得到规律即可；
 * 例如：
 * AAA: 26的平方*1+26的1次方*1+26的0次方*1；
 * BB：26的1次方*2+26的0次方*2；
 */
public class ExcelSheetColumnNumber_171 {

	public static void main(String args[]){
		String s="BA";
		System.out.println(titleToNumber(s));
	}
	
	public static int titleToNumber(String s) {
		if(s.length()<1)
			return 0;
		int sum=0;
        for(int i=0;i<s.length()-1;i++){
        	sum=sum+(int)(Math.pow(26, s.length()-1-i))*(s.charAt(i)-64);
        }
        sum=sum+s.charAt(s.length()-1)-64;
        return sum;
    }
}

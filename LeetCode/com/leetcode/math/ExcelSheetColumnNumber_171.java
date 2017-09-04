package com.leetcode.math;

/**
 * @author Demetria
 * ���⣺����ѧ���⣬�õ����ɼ��ɣ�
 * ���磺
 * AAA: 26��ƽ��*1+26��1�η�*1+26��0�η�*1��
 * BB��26��1�η�*2+26��0�η�*2��
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

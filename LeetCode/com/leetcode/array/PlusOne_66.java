package com.leetcode.array;
/**
 * ��Ŀ����һ���Ǹ��������������У�Ȼ���������һ���������һ����������������µ�����
 * �ص㣺�����ǰ��������λע���Ƿ�Ҫ��ǰ��һ����һ�Ļ�Ҫ�����µ����飬��1����������λ�������������ԭ�������������
 * */
public class PlusOne_66 {
	public static void main(String args[]){
		int[] digits={9,1,9,9,9,9,9,9,9};
		int[] test=plusOne(digits);
		for(int i=0;i<test.length;i++)
			System.out.println(test[i]);
	}
	public static int[] plusOne(int[] digits) {
		int[] ints=new int[digits.length+1];
		boolean flag=false;
        for(int i=digits.length-1;i>=0;i--){
        	int temp=digits[i]+1;
        	if(temp>=10){
        		if(i==0){
        			flag=true;
        			digits[i]=digits[i]+1-10;
        			for(int j=ints.length-1;j>=1;j--){
        				ints[j]=digits[j-1];
        			}
        			ints[i]=1;
        		}
        		else{
        			digits[i]=digits[i]+1-10;
        		}
        	}else{
        		digits[i]=digits[i]+1;
        		break;
        	}
        }
        if(flag)
        	return ints;
        else
        	return digits;
    }
}

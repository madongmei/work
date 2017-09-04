package com.leetcode.array;
/**
 * 题目：讲一个非负整数放在数组中，然后将这个数加一，计算出加一后的整数，并返回新的数组
 * 重点：最后往前遍历，首位注意是否要向前加一，加一的话要创建新的数组，把1放在数组首位，后面的数拷贝原数组计算后的数。
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

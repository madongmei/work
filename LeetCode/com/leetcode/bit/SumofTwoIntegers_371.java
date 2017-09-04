package com.leetcode.bit;

/**
 * @author Demetria
 * 题目：本题题意为：计算两个数的和，但是不能使用+,-号，说明智能使用位操作了。
 * 本题中总结出了一个计算方法，就是：
 * 通过循环计算不进位和（两个加数异或得到：a^b）和不进位和（两个加数相与得到：a&b）
 * 循环结束条件为不进位和等于零，此时的进位和即为结果。
 * 
 * 拓展：计算a*3的值。(不能使用*号)
 * 拓展：计算a*b的值。(不能使用*号)
 * 
 */
public class SumofTwoIntegers_371 {

	public static void main(String args[]){
		int a=-5;
		int b=6;
		System.out.println(getSum(a, b));
		System.out.println(getMul(a));
		System.out.println(getMul2(a, b));
	}
	
	//a+b
	public static int getSum(int a, int b) {
        int re1=a^b;//不进位和：异或得到
        int re2=a&b;//进位和：相与得到
        
        if(re2!=0){
        	return getSum(re1,re2<<1);
        }else{
        	return re1;
        }
    }
	
	
	//a*3
	public static int getMul(int a){
		int mul1=a<<1;
		return getSum(mul1, a);
	} 
	
	//a*b
	public static int getMul2(int a,int b){
		int sum=a;
		for(int i=0;i<Math.abs(b)-1;i++){
			sum=getSum(sum,a);
		}
		if(b>0)
			return sum;
		else{
			return -sum;
		}
	}
}


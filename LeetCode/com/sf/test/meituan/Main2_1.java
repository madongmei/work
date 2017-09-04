package com.sf.test.meituan;

import java.util.Scanner;

public class Main2_1 {
	public static void main(String args[]){
    	Scanner in = new Scanner(System.in);
    	int n=in.nextInt();
    	String str1=in.next();
    	String str2=in.next();
    	int num1=Integer.parseInt(str1,2);
    	int num2=Integer.parseInt(str2,2);
    	int result=num1^num2;
    	System.out.println("result:"+result);
	}
}

package com.sf.test.meituan;

import java.util.ArrayList;
import java.util.Scanner;

public class Main2 {
	public static void main(String args[]){
    	Scanner in = new Scanner(System.in);
    	int n=in.nextInt();//记住的单词数
    	int m=in.nextInt();//系统的单词数
    	ArrayList<String> str1=new ArrayList<String>();
    	ArrayList<String> str2=new ArrayList<String>();
    	for(int i=0;i<n;i++){
    		String temp=in.next();
    		if(str1.contains(temp))
    			continue;
    		else
    			str1.add(temp);
    	}
    	
    	for(int j=0;j<m;j++){
    		str2.add(in.next());
    	}
    	
    	System.out.println(str1.toString());
    	System.out.println(str2.toString());
    	int sum=0;
    	for(int i=0;i<str1.size();i++){
    		if(str2.contains(str1.get(i))){
    			int score=(int) Math.pow(str1.get(i).length(), 2);
    			sum+=score;
    		}
    	}
    	System.out.println(sum);
    }
}

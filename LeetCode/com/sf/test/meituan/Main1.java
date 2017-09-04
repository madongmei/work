package com.sf.test.meituan;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class Main1 {
	public static void main(String args[]){
    	Scanner in = new Scanner(System.in);
    	ScriptEngine se=new ScriptEngineManager().getEngineByName("JavaScript");
        while(in.hasNextLine()){
        	String str=in.nextLine();
        	int sum=0;
        	double result=0;
        	String substr="";
        	int j=0;
        	Queue<Character> q=new LinkedList<Character>();
        	for(int i=0;i<str.length();i++){
        		q.add(str.charAt(i));
        	}
        	try{
	        	while(!q.isEmpty()){
	        		char ch=q.poll();
	        		substr=substr+ch;
	        		j++;
	        		if(j==3){
	        			result=(Double) se.eval(substr);
	        		}else{
	        			continue;
	        		}
	        		substr=(int)result+"";
	        		j=1;
	        	}
        	}catch(Exception e){
        		e.printStackTrace();
        	}
        	System.out.println((int)result);
        }     
    }
}

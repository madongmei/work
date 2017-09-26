package com.stack;

import java.util.Stack;

/**
 * @author Demetria
 * ¸øÕ»ÅÅÐò
 */
public class SortStack {
	public static void main(String[] args) {
		Stack<Integer> s=new Stack<Integer>();
		s.push(1);
		s.push(6);
		s.push(2);
		s.push(3);
		s.push(8);
		s.push(4);
		
		print(s);
		s=sortStack(s);
		print(s);
	}
	
	public static Stack<Integer> sortStack(Stack<Integer> s){
		if(s.isEmpty())
			return s;
		Stack<Integer> r=new Stack<Integer>();
		while(!s.isEmpty()){
			int temp=s.pop();
			while(!r.isEmpty() && r.peek()>temp){
				s.push(r.pop());
			}
			r.push(temp);
		}
		return r;
	}
	
	public static void print(Stack<Integer> s){
		if(s==null)
			return;
		for(int i=0;i<s.size();i++){
			System.out.print(s.get(i)+" ");//´ÓÕ»µ×µ½Õ»¶¥Êä³öÔªËØ¡£
		}
		System.out.println();
	}  
}

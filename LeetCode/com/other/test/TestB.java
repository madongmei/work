package com.other.test;

import java.util.LinkedList;
import java.util.Queue;
public class TestB {
    public static void main(String[] args) {
        /*Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int l = in.nextInt();*/
    	int n=18;
    	int l=2;
        int sum=0;
        int count=0;
        
        Queue<Integer> queue=new LinkedList<Integer>();
        Queue<Object> queue1=new LinkedList<Object>();
        for(int k=1;k<n;k++){
            if(sum<n || count<l){
            	sum+=k;
                count++;
                queue.offer(k);
            }
            else if(sum==n && count>=l){
                if(queue1.size()==0 || queue1.size()>queue.size()){
                	
                }else{
                	queue.poll();
                	count--;
                }
            }else if(sum>n){
            	while(sum>n){
            		sum=sum-queue.poll();
            		count--;
            	}
            }
        }
        while(!queue.isEmpty()){
        	System.out.println(queue.poll()+" ");
        }
    }
}
package com.leetcode.hashtable;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class SingleNumber_136 {

	public static void main(String args[]){
		int[] nums={1,4,5,2,4,5,1,3,2};
		System.out.println(singleNumber(nums));
	}
	
	public static int singleNumber(int[] nums) {
        Map<Integer,Integer> map=new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++){
        	int count=1;
        	if(map.containsKey(nums[i])){
        		count=map.get(nums[i])+1;
        	}
        	map.put(nums[i], count);
        }
        
       Set<Integer> entry=map.keySet();
       Iterator<Integer> it=entry.iterator();
       while(it.hasNext()){
    	   int key=it.next();
    	   if(map.get(key)==1){
    		   return key;
    	   }
       }
       return -1;
    }
}

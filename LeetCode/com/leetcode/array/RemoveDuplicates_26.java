package com.leetcode.array;

import java.util.HashMap;

public class RemoveDuplicates_26 {
	
	public static void main(String[] args){
		int[] nums={1,1,2,2,3,5,6,4,4,4,6,7,8,9,9};
		System.out.println(removeDuplicates(nums));
	}
	
	 public static int removeDuplicates(int[] nums) {
	        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
	        int k=0;
	        for(int i=0;i<nums.length;i++){
	        	if(map.containsKey(nums[i]))
	        		continue;
	        	else{
	        		map.put(nums[i], i);
	        		nums[k++]=nums[i];
	        	}
	        }
		 	return k;
	    }
}

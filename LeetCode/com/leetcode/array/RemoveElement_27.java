package com.leetcode.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Demetria
 * 题目：去除数组中的指定元素，并且返回去除指定元素后的数组长度
 */
public class RemoveElement_27 {

	public static void main(String[] args){
		int[] nums={3,2,2,3,3};
		System.out.println(removeElement(nums,3));
	}
	public static int removeElement(int[] nums, int val) {
		int count=0;
	     for(int i=0;i<=nums.length-1;i++){
    		 if(nums[i]==val){
    			 for(int j=i+1;j<nums.length;j++){
    				 if(nums[j]!=val){
    					 int temp=nums[i];
    					 nums[i]=nums[j];
    					 nums[j]=temp;
    					 count++;
    					 break;
    				 }
    				 else{
    					 continue;
    				 }
    			 }
    		 }
    		 else{
    			 count++;
    			 continue;
    		 }
	     }
	     return count;
	}
}

package com.sf.test.change;

/**
 * @author Demetria
 * Ωªªª≈≈–Ú÷Æ°∞√∞≈›≈≈–Ú°±
 */
public class MPJHSort {
 
	public static void main(String args[]){
		int[] nums={49,38,65,97,76,13,27,49};
		nums=mpjhSort(nums);
		sop(nums);
	}
	
	public static int[] mpjhSort(int[] nums){
		
		for(int i=0;i<nums.length;i++){
			for(int j=0;j<nums.length-i-1;j++){
				if(nums[j]>nums[j+1]){
					int temp=nums[j+1];
					nums[j+1]=nums[j];
					nums[j]=temp;
				}
			}
		}
		return nums;
	}
	
	
	public static void sop(int[] nums){
		for(int i=0;i<nums.length;i++){
			System.out.println(nums[i]);
		}
	}
}

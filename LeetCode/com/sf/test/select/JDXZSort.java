package com.sf.test.select;

/**
 * @author Demetria
 * —°‘Ò≈≈–Ú÷Æ°∞ºÚµ•—°‘Ò≈≈–Ú°±
 */
public class JDXZSort {

	public static void main(String args[]){
		int[] nums={49,38,65,97,76,13,27,49};
		nums=jdxzSort(nums);
		sop(nums);
	}
	
	public static int[] jdxzSort(int[] nums){
		for(int i=0;i<nums.length-1;i++){
			for(int j=i+1;j<nums.length;j++){
				if(nums[j]<nums[i]){
					int temp=nums[i];
					nums[i]=nums[j];
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

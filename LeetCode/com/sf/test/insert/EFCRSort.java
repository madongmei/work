package com.sf.test.insert;

/**
 * @author Demetria
 * 插入排序之“二分插入排序”
 * 思想：通过二分查找的方式找到合适的位置，并插入
 * 在这里合适的位置在left上。
 */
public class EFCRSort {
	public static void main(String args[]){
		int[] nums={49,38,65,97,76,13,27,49};
		nums=efcrSort(nums);
		sop(nums);
	}
	
	public static int[] efcrSort(int[] nums){
		for(int i=0;i<nums.length;i++){
			int left=0;
			int right=i-1;
			int key=nums[i];
			int mid;
			while(left<=right){
				mid=(left+right)/2;
				if(nums[mid]>key)
					right=mid-1;
				if(nums[mid]<=key)
					left=mid+1;
			}
			for(int j=i-1;j>=left;j--){
				nums[j+1]=nums[j];
			}
			if(left!=i)
				nums[left]=key;
		}
		return nums;
	}
	
	public static void sop(int[] nums){
		for(int i=0;i<nums.length;i++){
			System.out.println(nums[i]);
		}
	}
}

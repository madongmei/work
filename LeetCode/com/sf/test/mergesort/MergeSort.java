package com.sf.test.mergesort;

/**
 * @author Demetria
 * 归并排序：先分组，每组排好序之后再合并。
 */
public class MergeSort {

	public static void main(String args[]){
		int[] nums={49,38,65,97,76,13,27,49};
		mergeSort(nums,0,nums.length-1);
		sop(nums);
	}
	
	public static void mergeSort(int[] nums,int left,int right){
		if(left<right){
			int middle=(left+right)/2;
			//对左边进行递归
			mergeSort(nums,left,middle);
			
			//对右边进行递归
			mergeSort(nums, middle+1, right);
			
			//合并
			merge(nums,left,middle,right);
		}
	}
	
	private static void merge(int[] nums, int left, int middle, int right) {
		int[] tempnums=new int[nums.length];
		int mid=middle+1;//右边的起始位置
		int temp=left;
		int third=left;
		while(left<=middle && mid<=right){
			//从两个数组中选取较小的数放入中间数组
			if(nums[left]<=nums[mid]){
				tempnums[third++]=nums[left++];
			}else{
				tempnums[third++]=nums[mid++];
			}
			
			}
			//将剩余的部分放入中间数组
			while(left<=middle){
				tempnums[third++]=nums[left++];
			}
			while(mid<=right){
				tempnums[third++]=nums[mid++];
			}
			//将临时数组中的数据复制到原数组
			while(temp<=right){
				nums[temp]=tempnums[temp++];
			}
	}
	
	public static void sop(int[] nums){
		for(int i=0;i<nums.length;i++){
			System.out.print(nums[i]+" ");
		}
	}
}

package com.sf.test.insert;

/**
 * @author Demetria
 * 插入排序之“直接插入排序”
 * 思想：两层循环：
 * -----外循环：从头遍历数组中的数据，假如当前循环中的元素为key
 * -----内循环：遍历key之前的元素，找到合适的位置并插入。
 * 
 */
public class ZJCRSort {

	public static void main(String args[]){
		int[] nums={49,38,65,97,76,13,27,49};
		nums=zjcrSort(nums);
		sop(nums);
	}
	
	public static int[] zjcrSort(int[] nums){
		for(int i=1;i<nums.length;i++){
			int key=nums[i];
			int j;
			for(j=i-1;j>=0;j--){//遍历在key之前的元素
				if(nums[j]>key){//如果在key元素之前的元素有比key大的，那么让它往后移就可以了
					nums[j+1]=nums[j];
				}else{//如果没有比key小的元素了，那么就找到位置了。
					break;
				}
			}
			nums[j+1]=key;//合适的位置为key。
		}
		return nums;
	}
	
	public static void sop(int[] nums){
		for(int i=0;i<nums.length;i++){
			System.out.println(nums[i]);
		}
	}
}

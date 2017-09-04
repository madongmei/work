package com.sf.test.insert;

/**
 * @author Demetria
 * 希尔排序:类似于直接插入排序，只是需要在最外面加上一个for循环。希尔排序是将排序的数组分成了几个“小组”，每组进行直接插入排序，
 */
public class XECRSort {

	public static void main(String args[]){
		int[] nums={49,38,65,97,76,13,27,49};
		nums=xecrSort(nums);
		sop(nums);
	}
	
	public static int[] xecrSort(int[] nums){
		int d=nums.length;
		while(true){
			d=d/2;
			for(int i=0;i<d;i++){
				for(int j=i+d;j<nums.length;j=j+d){
					int key=nums[j];
					int k;
					for(k=j-d;k>=0;k=k-d){
						if(nums[k]>key)
							nums[k+d]=nums[k];
						else
							break;
					}
					nums[k+d]=key;
				}
			}
			if(d==1)
				break;
		}
		return nums;
	}
	
	
	public static void sop(int[] nums){
		for(int i=0;i<nums.length;i++){
			System.out.println(nums[i]);
		}
	}
}


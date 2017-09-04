package com.sf.test.change;

/**
 * @author Demetria
 * ��������ע������
 * һ�ǽ����������Թؼ���keyΪ��׼�ֳ�������
 * ����
 */
public class KSPXSort {

	public static void main(String args[]){
		int[] nums={49,38,65,97,76,13,27,49};
		nums=quickSort(nums,0,nums.length-1);
		sop(nums);
	}
	
	public static int[] quickSort(int[] nums,int low,int high){
		if(low<high){
			int key=partition(nums,low,high);
			quickSort(nums, low, key-1);
			quickSort(nums, key+1, high);
		}
		return nums;
	}
	
	private static int partition(int[] nums, int low, int high) {
		// TODO Auto-generated method stub
		int temp=nums[low];
		while(low<high){
			while(low<high && nums[high]>=temp){
				high--;
			}
			nums[low]=nums[high];
			while(low<high && nums[low]<=temp){
				low++;
			}
			nums[high]=nums[low];
		}
		nums[low]=temp;
		
		return low;
	}

	public static void sop(int[] nums){
		for(int i=0;i<nums.length;i++){
			System.out.println(nums[i]);
		}
	}
}

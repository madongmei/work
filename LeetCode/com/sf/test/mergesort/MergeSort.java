package com.sf.test.mergesort;

/**
 * @author Demetria
 * �鲢�����ȷ��飬ÿ���ź���֮���ٺϲ���
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
			//����߽��еݹ�
			mergeSort(nums,left,middle);
			
			//���ұ߽��еݹ�
			mergeSort(nums, middle+1, right);
			
			//�ϲ�
			merge(nums,left,middle,right);
		}
	}
	
	private static void merge(int[] nums, int left, int middle, int right) {
		int[] tempnums=new int[nums.length];
		int mid=middle+1;//�ұߵ���ʼλ��
		int temp=left;
		int third=left;
		while(left<=middle && mid<=right){
			//������������ѡȡ��С���������м�����
			if(nums[left]<=nums[mid]){
				tempnums[third++]=nums[left++];
			}else{
				tempnums[third++]=nums[mid++];
			}
			
			}
			//��ʣ��Ĳ��ַ����м�����
			while(left<=middle){
				tempnums[third++]=nums[left++];
			}
			while(mid<=right){
				tempnums[third++]=nums[mid++];
			}
			//����ʱ�����е����ݸ��Ƶ�ԭ����
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

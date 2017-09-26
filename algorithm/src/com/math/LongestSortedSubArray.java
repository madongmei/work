package com.math;

/**
 * @author Demetria
 * 求最长递增序列问题
 * 
 * 例如：1,-3,4,-9,5,-9,-8,6
 * 最长递增序列为1,4,5,6
 */
public class LongestSortedSubArray {
	public static void main(String[] args) {
		int[] arr={1,-3,4,-9,5,-9,-8,6};
		System.out.println(getResult(arr));
	}
	
	public static int getResult(int[] arr){
		int[] list=new int[arr.length];
		for(int i=0;i<arr.length;i++){
			list[i]=1;
			for(int j=0;j<i;j++){
				if(arr[j]<arr[i] && list[j]+1>list[i])
					list[i]=list[j]+1;
			}
		}
		
		int max=0;
		for(int k=0;k<list.length;k++){
			if(list[k]>max)
				max=list[k];
		}
		return max;
	}
}

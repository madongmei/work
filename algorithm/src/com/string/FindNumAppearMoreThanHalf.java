package com.string;

/**
 * @author Demetria
 * 查找出现次数超过数组长度一半的数字
 */
public class FindNumAppearMoreThanHalf {
	public static void main(String[] args) {
		int[] arr={1,4,3,2,5,3,9,3,3,3,3,3,3};
		System.out.println(getNum(arr));
	}
	
	public static int getNum(int[] arr){
		if(arr==null)
			return -1;//没有这样的数
		
		int result=arr[0];
		int count=1;
		for(int i=1;i<arr.length;i++){
			if(count==0){
				result=arr[i];
				count=1;
			}else if(arr[i]==result)
				count++;
			else
				count--;
		}
		
		if(checkNum(arr, result)) //确出现次数超过一半。
			return result;
		return -1;
	}
	
	public static boolean checkNum(int[] arr, int num){
		int count=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]==num)
				count++;
		}
		
		if(count>arr.length/2)
			return true;
		else
			return false;
	}
}

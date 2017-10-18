package com.string;

/**
 * @author Demetria
 * ���ҳ��ִ����������鳤��һ�������
 */
public class FindNumAppearMoreThanHalf {
	public static void main(String[] args) {
		int[] arr={1,4,3,2,5,3,9,3,3,3,3,3,3};
		System.out.println(getNum(arr));
	}
	
	public static int getNum(int[] arr){
		if(arr==null)
			return -1;//û����������
		
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
		
		if(checkNum(arr, result)) //ȷ���ִ�������һ�롣
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

package com.string;

/**
 * @author Demetria
 * ���������г��ִ���ֻ��һ�ε�һ�����������������������Ρ�
 */
public class FindOneNumAppearOnce {
	public static void main(String[] args) {
		int[] arr={2,3,4,1,2,3,4,5,6,1,5,6,7};
		System.out.println(getNum(arr));
	}
	
	public static int getNum(int[] arr){
		if(arr==null)
			return -1;
		int index=0;
		for(int i=0;i<arr.length;i++){
			index^=arr[i];
		}
		return index;
	}
}

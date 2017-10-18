package com.string;

/**
 * @author Demetria
 * �ַ���[ѭ������]������ߵ��ַ��ӵ��ַ���ĩβ
 * ���磺abcdef  ѭ������3λ�����Ϊdefabc
 */
public class XHZY {
	public static void main(String[] args) {
		String str="1234556";
		int from=3;
		char[] nums=leftRotateString(str, from);
		System.out.println(minNumInStr(nums));
	}
	
	private static int minNumInStr(char[] nums) {
		int len=nums.length;
		if(len==0)
			return -1;//����Ϊ��
		if(len==1)
			return nums[0];
		
		int low=0;
		int high=len-1;
		while(low<=high){
			int mid=(low+high)/2;
			if(nums[mid]>nums[high])
				low=mid+1;
			else if(nums[mid]==nums[high])
				high--;
			else
				high=mid;
		}
		return nums[low]-'0';
	}

	public static char[] leftRotateString(String str,int from){
		//from�Ǵӵڼ�λ��ʼѭ������
		int len=str.length();
		if(len==0)
			return null;
		
		char[] chs=str.toCharArray();
		reverse(chs,0,from-1);
		reverse(chs,from,len-1);
		reverse(chs,0,len-1);
		return chs;
		
	}
	
	public static void reverse(char[] chs,int from,int end){
		
		while(from<end){
			char ch=chs[from];
			chs[from++]=chs[end];
			chs[end--]=ch;
		}
	}
}

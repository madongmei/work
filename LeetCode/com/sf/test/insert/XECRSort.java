package com.sf.test.insert;

/**
 * @author Demetria
 * ϣ������:������ֱ�Ӳ�������ֻ����Ҫ�����������һ��forѭ����ϣ�������ǽ����������ֳ��˼�����С�顱��ÿ�����ֱ�Ӳ�������
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


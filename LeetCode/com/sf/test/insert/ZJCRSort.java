package com.sf.test.insert;

/**
 * @author Demetria
 * ��������֮��ֱ�Ӳ�������
 * ˼�룺����ѭ����
 * -----��ѭ������ͷ���������е����ݣ����統ǰѭ���е�Ԫ��Ϊkey
 * -----��ѭ��������key֮ǰ��Ԫ�أ��ҵ����ʵ�λ�ò����롣
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
			for(j=i-1;j>=0;j--){//������key֮ǰ��Ԫ��
				if(nums[j]>key){//�����keyԪ��֮ǰ��Ԫ���б�key��ģ���ô���������ƾͿ�����
					nums[j+1]=nums[j];
				}else{//���û�б�keyС��Ԫ���ˣ���ô���ҵ�λ���ˡ�
					break;
				}
			}
			nums[j+1]=key;//���ʵ�λ��Ϊkey��
		}
		return nums;
	}
	
	public static void sop(int[] nums){
		for(int i=0;i<nums.length;i++){
			System.out.println(nums[i]);
		}
	}
}

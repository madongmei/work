package com.leetcode.bit;

/**
 * @author Demetria
 * ��Ŀ����������Ϊ�������������ĺͣ����ǲ���ʹ��+,-�ţ�˵������ʹ��λ�����ˡ�
 * �������ܽ����һ�����㷽�������ǣ�
 * ͨ��ѭ�����㲻��λ�ͣ������������õ���a^b���Ͳ���λ�ͣ�������������õ���a&b��
 * ѭ����������Ϊ����λ�͵����㣬��ʱ�Ľ�λ�ͼ�Ϊ�����
 * 
 * ��չ������a*3��ֵ��(����ʹ��*��)
 * ��չ������a*b��ֵ��(����ʹ��*��)
 * 
 */
public class SumofTwoIntegers_371 {

	public static void main(String args[]){
		int a=-5;
		int b=6;
		System.out.println(getSum(a, b));
		System.out.println(getMul(a));
		System.out.println(getMul2(a, b));
	}
	
	//a+b
	public static int getSum(int a, int b) {
        int re1=a^b;//����λ�ͣ����õ�
        int re2=a&b;//��λ�ͣ�����õ�
        
        if(re2!=0){
        	return getSum(re1,re2<<1);
        }else{
        	return re1;
        }
    }
	
	
	//a*3
	public static int getMul(int a){
		int mul1=a<<1;
		return getSum(mul1, a);
	} 
	
	//a*b
	public static int getMul2(int a,int b){
		int sum=a;
		for(int i=0;i<Math.abs(b)-1;i++){
			sum=getSum(sum,a);
		}
		if(b>0)
			return sum;
		else{
			return -sum;
		}
	}
}


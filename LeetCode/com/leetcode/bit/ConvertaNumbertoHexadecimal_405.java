package com.leetcode.bit;

/**
 * @author Demetria
 * ���⣺�����ú������еĺ�������ʮ����ת��Ϊʮ�����ƣ�����������ת��Ϊʮ�����Ʋ�����ʽ��
 * ������ò���ȽϷ��㡣
 * ˼·��ʮ����תʮ�����ƣ�ֻ�轫ʮ������num&15��ȡ����λ��,Ȼ��num=num>>>4(������λ��ȡ����λ)��ѭ������Ϊnum��=0;
 * ����ⷨ��ʹ���˲������'0'-'F'��������chs�У�Ȼ��chs[num&15]��ֵ��Ϊ��ǰ��λת��Ϊʮ�����ƺ������
 * 
 */
public class ConvertaNumbertoHexadecimal_405 {

	public static void main(String args[]){
		System.out.println(toHex(28));
	}
	
	public static String toHex(int num) {
		if(num==0)
			return "0";
		char[] chs={'0','1','2','3','4','5',
					'6','7','8','9','a','b',
					'c','d','e','f'};
		char[] temp=new char[8];
		int i=temp.length;
		while(num!=0){
			int val=num&15;
			temp[--i]=chs[val];
			num=num>>>4;
		}
		return (new String(temp)).trim();
    }
}

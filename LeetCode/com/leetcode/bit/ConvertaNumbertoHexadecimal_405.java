package com.leetcode.bit;

/**
 * @author Demetria
 * 题意：不适用函数库中的函数，将十进制转换为十六进制，包括将负数转换为十六进制补码形式。
 * 这里采用查表法比较方便。
 * 思路：十进制转十六进制，只需将十进制数num&15（取低四位）,然后num=num>>>4(右移四位，取高四位)。循环条件为num！=0;
 * 这个解法中使用了查表法，将'0'-'F'放在数组chs中，然后将chs[num&15]的值即为当前四位转换为十六进制后的数。
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

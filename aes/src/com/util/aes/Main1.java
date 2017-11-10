package com.util.aes;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

public class Main1 {
	public static void main(String[] args) throws UnsupportedEncodingException {
		char[] key={0x2b, 0x7e, 0x15, 0x16, 
					0x28, 0xae, 0xd2, 0xa6, 
					0xab, 0xf7, 0x15, 0x88, 
					0x09, 0xcf, 0x4f, 0x3c
					};
		
		AES aes=new AES(key);
		String source="中国LKsnfvdjzb你找不到局还比较自动回复VB证监会不大致基本vjhbdvj";
		char[] input=aes.aesEncoder(source);
		
		System.out.println("input:");
		print(input);
		int len1=input.length;
		
		long start1=System.nanoTime();
		input=aes.aesCipher_v1(len1,input);
		long end1=System.nanoTime();
		System.out.println("新算法加密output:");
		print(input);
		
		
		int len=input.length;
		input=aes.aesInvCipher(len,input);
		System.out.println("新算法解密output:");
		print(input);
		System.out.println(aes.aesDecode(len1,input));
		System.out.println("新算法用时："+(end1-start1));
		
	}

	public static void print(char[] input) {
		int i=0;
		for(i=0;i<input.length;i++){
			System.out.print(input[i]);
		}
		System.out.println();
	}
}

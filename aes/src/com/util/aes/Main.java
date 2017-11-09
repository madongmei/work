package com.util.aes;

public class Main {
	public static void main(String[] args) {
		char[] key={0x2b, 0x7e, 0x15, 0x16, 
					0x28, 0xae, 0xd2, 0xa6, 
					0xab, 0xf7, 0x15, 0x88, 
					0x09, 0xcf, 0x4f, 0x3c
					};
		/*char[] input={
					0x32, 0x43, 0xf6, 0xa8, 
					0x88, 0x5a, 0x30, 0x8d, 
					0x31, 0x31, 0x98, 0xa2, 
					0xe0, 0x37, 0x07, 0x34	
					};*/
		//String str="Hello,World! AES";
		String str="assffDSVSDVEWVSDsaffwefs";
		char[] input=str.toCharArray();
		AES aes=new AES(key);
		System.out.println("input:");
		print(input);
		
		
		long start=System.nanoTime();
		input=aes.cipher(input);
		long end=System.nanoTime();
		System.out.println("原算法加密output:");
		print(input);
		
		input=aes.invCipher(input);
		System.out.println("原算法解密output:");
		print(input);
		System.out.println("原算法用时:"+(end-start));
		
		
		long start1=System.nanoTime();
		input=aes.cipher_v1(input);
		long end1=System.nanoTime();
		System.out.println("新算法加密output:");
		print(input);
		
		input=aes.invCipher(input);
		System.out.println("新算法解密output:");
		print(input);
		System.out.println("新算法用时："+(end1-start1));
		
		
		
		
	}

	public static void print(char[] input) {
		// TODO Auto-generated method stub
		int i=0;
		for(i=0;i<16;i++){
			//System.out.print(Integer.toHexString(input[i])+",");
			System.out.print(input[i]);
		}
		System.out.println();
	}
}

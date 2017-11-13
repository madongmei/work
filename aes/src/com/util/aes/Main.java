package com.util.aes;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

public class Main {
	public static void main(String[] args) throws UnsupportedEncodingException {
		char[] key={0x2b, 0x7e, 0x15, 0x16, 
					0x28, 0xae, 0xd2, 0xa6, 
					0xab, 0xf7, 0x15, 0x88, 
					0x09, 0xcf, 0x4f, 0x3c
					};
		
		AES aes=new AES(key);
		
		for(int i=1;i<=1;i++){
			String filename=i+".txt";
			String inpath="in1/"+filename;
			//String secretpath="test/"+filename;
			//String outpath="test/"+filename;
			String secretpath="test/secret.txt";
			String outpath="test/out.txt";
			BufferedReader br=null;
		    try {
				br=new BufferedReader(new FileReader(inpath));
				String s=null;
				while(((s=br.readLine())!=null)){
					//sb.append(System.getProperty("line.separator")+s);
					String source=s.toString();
					int length=source.length();
				    char[] input=aes.aesEncoder(source);
					
					int len1=input.length;
					
					long start1=System.nanoTime();
					input=aes.aesCipher(len1,input);
					long end1=System.nanoTime();
					print(new String(input),secretpath);
					
					
					int len=input.length;
					input=aes.aesInvCipher(len,input);
					String des=aes.aesDecode(len1, input);
					print(des,outpath);
					
					long time=end1-start1;
					System.out.println("length:"+length+"...time:"+time);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}finally{
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

	public static void print(String str,String name) {
		BufferedWriter bw=null;
		try {
			bw=new BufferedWriter(new FileWriter(name));
			bw.write(str);
			bw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try {
				bw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
}

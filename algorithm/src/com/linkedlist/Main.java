package com.linkedlist;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();//���ݸ���
		int[] arr=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=in.nextInt();
		}
		
		int page=in.nextInt();//ҳ��
		int size=in.nextInt();//ÿҳ������ݸ���
		int temp=0;
		/*if(n%size!=0)
			temp=n/size+1;
		else
			temp=n/size;*/
		if(page>=((n*1.0)/size)){
			System.out.println("������ҳ��Χ");
			return;
		}
		int start=page*size;
		for(int i=start;i<start+size;i++){
			System.out.println(arr[i]);
		}
	}
}

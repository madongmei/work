package com.math;

/**
 * @author Demetria
 * ���⣺����һ������A[0,1,...,n-1],�빹��һ������B[0,1,...,n-1],
 * ��������B�е�Ԫ��B[i]=A[0]*A[1]*...*A[i-1]*A[i+1]*...*A[n-1],�����ó�����
 * 
 * ˼·��
 * B[i]=A[0]*A[1]*...*A[i-1]*A[i+1]*...*A[n-1]
 * �Ȱ�A[0]*A[1]*...*A[i]��������ٳ���A[i-1]*A[i+1]*...*A[n-1]
 */
public class GetBFromA {
	public static void main(String[] args) {
		int[] A={0,1,2,3,4,5,6};
		int[] B=getBfromA(A);
		for(int i=0;i<B.length;i++)
			System.out.print(B[i]+" ");
		/*int[] B=new int[7];
		translate(A, B, 7);*/
		
	}
	
	public static int[] getBfromA(int[] A){
		int len=A.length;
		if(len==0)
			return null;
		
		int[] B=new int[len];
		B[0]=1;
		for(int i=1;i<=len-1;i++){
			B[i]=B[i-1]*A[i-1];
		}
		
		int temp=1;
		for(int i=len-1;i>=1;i--){
			B[i]*=temp;
			temp*=A[i];
		}
		
		return B;
	} 
	
	public static void translate(int a[], int b[], int n)
	{
	    b[0] = 1;
	    for (int i = 1; i <= n-1; i++)
	    {
	        b[i] = b[i-1]*a[i-1];
	    }

	    for (int i = n-1; i >= 1; i--)
	    {
	        b[i] *= b[0];
	        b[0] *= a[i];
	    }
	    
	    for(int i=0;i<b.length;i++){
	    	System.out.print(b[i]+" ");
	    }
	}
}

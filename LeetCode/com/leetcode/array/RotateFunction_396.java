package com.leetcode.array;

/**
 * @author Demetria
 *题目：
 * Given an array of integers A and let n to be its length.
 * Assume Bk to be an array obtained by rotating the array A k positions clock-wise, we define a "rotation function" F on A as follow:
 * F(k) = 0 * Bk[0] + 1 * Bk[1] + ... + (n-1) * Bk[n-1].
 * Calculate the maximum value of F(0), F(1), ..., F(n-1).
 * Note:
 * n is guaranteed to be less than 105.
 * Example:
 * A = [4, 3, 2, 6]
 * F(0) = (0 * 4) + (1 * 3) + (2 * 2) + (3 * 6) = 0 + 3 + 4 + 18 = 25
 * F(1) = (0 * 6) + (1 * 4) + (2 * 3) + (3 * 2) = 0 + 4 + 6 + 6 = 16
 * F(2) = (0 * 2) + (1 * 6) + (2 * 4) + (3 * 3) = 0 + 6 + 8 + 9 = 23
 * F(3) = (0 * 3) + (1 * 2) + (2 * 6) + (3 * 4) = 0 + 2 + 12 + 12 = 26
 * So the maximum value of F(0), F(1), F(2), F(3) is F(3) = 26.
 * 
 * 难点：学会灵活转换计算方法，不能用一般的按照公式进行计算的方法，否则会超时，实践复杂度太高。
 */
public class RotateFunction_396 {
	public static void main(String args[]){
		int[] A={4,3,2,6};
		System.out.println(maxRotateFunction(A));
	}
	//超时
	/*public static int maxRotateFunction(int[] A) {
		int max=Integer.MIN_VALUE;
		int[] sum=new int[A.length];
        for(int i=0;i<A.length;i++){
        	sum[i]=0;
        	for(int j=i,k=0;k<A.length;k++){
        		sum[i]=sum[i]+j*A[k];
        		if(j+1>=A.length){
        			j=0;
        		}
        		else{
        			j++;
        		}
        	}
        	if(max<sum[i]){
        		max=sum[i];
        	}
        }
        return max;
    }*/
	
	public static int maxRotateFunction(int[] A) {
		int len=A.length;
        if(len==0){
            return 0;
        }
        int sum=0;
        int temp=0;
        for(int i=0;i<len;i++){
            sum+=A[i];
            temp+=i*A[i];
        }
        int max=temp;
        for(int j=1;j<len;j++){
            temp=temp-sum+A[j-1]*len;
            max=Math.max(max,temp);
        }
        return max;
    }
}

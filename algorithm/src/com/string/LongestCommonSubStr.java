package com.string;

/**
 * @author Demetria
 * 查找最长公共字串序列（非连续）
 */
public class LongestCommonSubStr {
	public static void main(String[] args) {
		String str1="abcdefgjjjhggsll";
		String str2="ahjicdefjjll";
		System.out.println(getLongestCommonStr(str1,str2));
		
	}
	
	
	public static int getLongestCommonStr(String str1,String str2){
		if(str1==null || str2==null)
			return 0;
		
		int len1=str1.length();
		int len2=str2.length();
		
		int[][] c=new int[len1+1][len2+1];
		for(int i=0;i<=len1;i++){
			for(int j=0;j<=len2;j++){
				if(i==0 || j==0)
					c[i][j]=0;
				else if(str1.charAt(i-1)==str2.charAt(j-1)){
					c[i][j]=c[i-1][j-1]+1;
				}else{
					c[i][j]=max(c[i-1][j],c[i][j-1]);
				}
			}
		}
		return c[len1][len2];
	}
	
	public static int max(int a,int b){
		return a>b?a:b;
	}
}

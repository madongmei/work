package com.leetcode.string;

public class CompareVersionNumbers_165 {

	public static void main(String args[]){
		String version1="000001";
		String version2="1.3.4.5";
		
		System.out.println(compareVersion(version1, version2));
	}
	
	public static int compareVersion_1(String version1, String version2) {
		String[] strs1=version1.split("\\.");
		String[] strs2=version2.split("\\.");
		
		int i=0;
		while(strs1.length>i || strs2.length>i){
			int v1=0;
			int v2=0;
			if(strs1.length>i)
				v1=Integer.valueOf(strs1[i]);
			if(strs2.length>i)
				v2=Integer.valueOf(strs2[i]);
			
			if(v1>v2) return 1;
			if(v1<v2) return -1;
			
			i++;
		}
		return 0;
    }
	
	
	public static int compareVersion(String version1, String version2) {
		String[] strs1=version1.split("\\.");
		String[] strs2=version2.split("\\.");
		
		for(int i=0;i<strs1.length || i<strs2.length;i++){
			int v1=0;
			int v2=0;
			if(strs1.length>i)
				v1=Integer.valueOf(strs1[i]);
			if(strs2.length>i)
				v2=Integer.valueOf(strs2[i]);
			
			if(v1>v2)
				return 1;
			else if(v1<v2)
				return -1;
		}
		return 0;
    }
}

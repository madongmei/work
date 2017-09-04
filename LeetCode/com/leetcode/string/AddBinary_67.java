package com.leetcode.string;

public class AddBinary_67 {

	public static void main(String args[]){
		String a="1";
		String b="111";
		System.out.println(addBinary(a, b));
	}
	
	//此方法有点投机取巧。。。。核心不是对字符串操作。
	public static String addBinary_1(String a, String b) {
        
		long num1=Integer.parseInt(a, 2);
		long num2=Integer.parseInt(b, 2);
		long sum=num1+num2;
		String result=Long.toBinaryString(sum);
		return result;
		
    }
	
	//虽然篇幅有点长，最终还是AC了，加油。
	public static String addBinary(String a,String b){
		
		StringBuilder sb1=new StringBuilder();
		sb1.append(a);
		
		StringBuilder sb2=new StringBuilder();
		sb2.append(b);
		
		int[] arr1=charArray2intArray(sb1.reverse().append("0").toString().toCharArray());
		int[] arr2=charArray2intArray(sb2.reverse().append("0").toString().toCharArray());
		String restr="";
		if(arr1.length>arr2.length){
			restr=dealFun(arr1,arr2);
		}
		else{
			restr=dealFun(arr2,arr1);
		}
		return restr;
	}
	
	
	public static String dealFun(int[] arr1,int[] arr2){
		StringBuilder sb=new StringBuilder();
		
		int i=0;
		int j=0;
		int temp=0;
		while(i<arr1.length || j<arr2.length){
			int add1=0;
			int add2=0;
			if(i<arr1.length)
				add1=arr1[i];
			if(i<arr2.length)
				add2=arr2[i];
			if(add1+add2<2){
				temp=add1+add2;
				sb.append(temp);
				i++;
				j++;
			}else if(add1+add2==2){
				temp=0;
				arr1[i+1]=arr1[i+1]+1;
				sb.append(temp);
				i++;
				j++;
			}else if(add1+add2==3){
				temp=1;
				arr1[i+1]=arr1[i+1]+1;
				sb.append(temp);
				i++;
				j++;
			}
		}
		String restr=sb.reverse().toString();
		if(restr.charAt(0)=='0'){
			return restr.substring(1, restr.length());
		}
		return restr;
	}
	
	
	 private static int[] charArray2intArray(char[] arr){
	        int[] intArr = new int[arr.length];
	        for (int i=0; i<arr.length; i++) {
	            intArr[i] = Integer.parseInt(String.valueOf(arr[i]));
	        }
	        return intArr;
	    }
	 
	 public static void sop(int[] arr){
		 for(int i=0;i<arr.length;i++){
			 System.out.print(arr[i]+" ");
		 }
	 }
}

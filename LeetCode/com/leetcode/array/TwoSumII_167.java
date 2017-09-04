package com.leetcode.array;

public class TwoSumII_167 {
	
	public static void main(String args[]){
		int[] nums={-3,3,4,90};
		int[] res=twoSum(nums,0);
		for(int i=0;i<res.length;i++){
			System.out.print(res[i]+" ");
		}
	}
	// Time Limit Exceeded
	 public static int[] twoSum_1(int[] nums, int target) {
	     int[] res=new int[2];
	     int flag=0;
		 for(int i=0;i<nums.length-1;i++){
			if(nums[i]>target)
				 continue;
        	for(int j=i+1;j<nums.length;j++){
        		if((nums[i]+nums[j])==target){
        				res[0]=j+1;
        				res[1]=i+1;
	        			flag=1;
	        			break;
        		}
        	}
        	if(flag==1)
        		break;
	     }
		 return res;
	    }
	 
	 //AC
	 public static int[] twoSum(int[] nums, int target) {
		 int[] res=new int[2];
		 int low=0;
		 int high=nums.length-1;
		 while(low<high){
			 if(nums[low]+nums[high]==target){
				 res[0]=low+1;
				 res[1]=high+1;
				 break;
			 }else if(nums[low]+nums[high]>target){
				 high--;
			 }else{
				 low++;
			 }
		 }
		 return res;
	 }
	 
}

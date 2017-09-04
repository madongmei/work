package com.leetcode.hashtable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntersectionofTwoArraysII_350 {

	public static void main(String args[]){
		int[] nums1={1,2,2,1};
		int[] nums2={2,2};
		int[] temp=intersect(nums1, nums2);
		for(int i=0;i<temp.length;i++){
			System.out.print(temp[i]+" ");
		}
	}
	
	public static int[] intersect(int[] nums1, int[] nums2) {
		List<Integer> list=new ArrayList<Integer>();
		for(int i=0;i<nums1.length;i++){
			list.add(nums1[i]);
		}
		int k=0;
		int[] temp=new int[nums1.length];
		for(int i=0;i<nums2.length;i++){
			if(list.contains(new Integer(nums2[i]))){
				temp[k++]=nums2[i];
				list.remove(new Integer(nums2[i]));
			}
		}
		return Arrays.copyOfRange(temp, 0, k);
    }
}

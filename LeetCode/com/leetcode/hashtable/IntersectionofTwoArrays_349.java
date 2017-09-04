package com.leetcode.hashtable;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @author Demetria
 * 题意：找到两个数组的相同元素，返回相同元素组成的数组，注意元素互异性。
 */
public class IntersectionofTwoArrays_349 {

	public static void main(String args[]){
		int[] nums1={1,2,2,13,3,3};
		int[] nums2={2,2,3,0,0};
		int[] temp=intersection(nums1, nums2);
		for(int i=0;i<temp.length;i++){
			System.out.println(temp[i]);
		}
	}
	
	public static int[] intersection(int[] nums1, int[] nums2) {
        Map<Integer,Integer> map1=new Hashtable<Integer, Integer>();
        Map<Integer,Integer> map2=new Hashtable<Integer, Integer>();
        
        for(int i=0;i<nums1.length;i++){
        	int count=1;
        	if(map1.containsKey(nums1[i])){
        		count=map1.get(nums1[i])+1;
        	}
        	map1.put(nums1[i], count);
        }
        System.out.println(map1);
        
        for(int i=0;i<nums2.length;i++){
        	int count=1;
        	if(map2.containsKey(nums2[i])){
        		count=map2.get(nums2[i])+1;
        	}
        	map2.put(nums2[i], count);
        }
        System.out.println(map2);
        
        
        if(map1.size()>map2.size()){
        	return getIntersection(map2,map1);
        }else{
        	return getIntersection(map1,map2);
        }
    }

	private static int[] getIntersection(Map<Integer, Integer> map1,
			Map<Integer, Integer> map2) {
		Set<Integer> set=map1.keySet();
		Iterator<Integer> it=set.iterator();
		int[] ints=new int[map1.size()];
		int k=0;
		while(it.hasNext()){
			int key=it.next();
			if(map2.containsKey(key)){
				ints[k++]=key;
			}
		}
		ints=Arrays.copyOfRange(ints, 0, k);
		return ints;
	}
}

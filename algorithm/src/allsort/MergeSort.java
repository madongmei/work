package allsort;

/**
 * @author Demetria
 * 将两个有序数组合并成一个有序数组
 */
public class MergeSort {

	public static void main(String[] args) {
		int[] nums1={1,2,3,8,9};
		int[] nums2={6,7,7};
		int[] nums=mergesort(nums1, nums2);
		for(int i=0;i<nums.length;i++){
			System.out.print(nums[i]);
		}
	}
	
	public static int[] mergesort(int[] nums1,int[] nums2){
		int len1=nums1.length;
		int len2=nums2.length;
		int[] nums=new int[len1+len2];
		int i=0;
		int j=0;
		int k=0;
		while(i<len1 || j<len2){
			if(i<len1 && j<len2){
				if(nums1[i]>nums2[j]){
					nums[k++]=nums2[j];
					j++;
				}else{
					nums[k++]=nums1[i];
					i++;
				}
			}
			else if(i<len1){
				nums[k++]=nums1[i];
				i++;
			}else if(j<len2){
				nums[k++]=nums2[j];
				j++;
			}
		}
		
		return nums;
	}
}

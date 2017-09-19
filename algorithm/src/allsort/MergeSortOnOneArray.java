package allsort;

/**
 * @author Demetria
 * 利用归并排序对无序数组排序
 */
public class MergeSortOnOneArray {

	public static void main(String[] args) {
		int[] nums1={1,2,3,8,9,3,4,6,1,4};
		int low=0;
		int high=nums1.length-1;
		int[] nums=sort(nums1,low,high);
		for(int i=0;i<nums.length;i++){
			System.out.print(nums[i]);
		}
	}
	
	public static int[] sort(int[] nums,int low,int high){
		int mid=(low+high)/2;
		if(low<high){
			sort(nums,low,mid);
			sort(nums,mid+1,high);
			mergesort(nums,low,mid,high);
		}
		return nums;
	}
	
	public static int[] mergesort(int[] nums1,int low,int mid,int high){
		int len1=mid;
		int len2=high;
		int[] nums=new int[high+1];
		int i=low;
		int j=mid+1;
		int k=0;
		while(i<=len1 || j<=len2){
			if(i<=len1 && j<=len2){
				if(nums1[i]>nums1[j]){
					nums[k++]=nums1[j];
					j++;
				}else{
					nums[k++]=nums1[i];
					i++;
				}
			}
			else if(i<=len1){
				nums[k++]=nums1[i];
				i++;
			}else if(j<=len2){
				nums[k++]=nums1[j];
				j++;
			}
		}
		
		return nums;
	}
}

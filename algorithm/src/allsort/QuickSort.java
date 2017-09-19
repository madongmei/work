package allsort;

/**
 * @author Demetria
 * 快速排序
 * 思想：通过一趟排序，将待排序记录分割成独立的两个部分，
 * 其中前一部分的记录比后一部分的记录的数字小，
 * 则可分别对这两部分记录进行排序，以达到整个序列有序。
 * 复杂度分析：最好O(nlogn) 最坏O(n^2) 平均O(nlogn)
 */
public class QuickSort {
	public static void main(String[] args) {
		int[] nums={5,3,7,9,1,5,6};
		quickSort(nums);
		for(int i=0;i<nums.length;i++){
			System.out.print(nums[i]+" ");
		}
	}

	private static void quickSort(int[] nums) {
		sort(nums,0,nums.length-1);
	}

	private static void sort(int[] nums, int i, int j) {
		int low=i;
		int high=j;
		if(i>j)
			return;
		int index=nums[i];
		while(i<j){
			while(i<j && nums[j]>index)
				j--;
			if(i<j)
				nums[i++]=nums[j];
			
			while(i<j && nums[i]<index)
				i++;
			if(i<j)
				nums[j--]=nums[i];
		}
		nums[i]=index;
		sort(nums,low,i-1);
		sort(nums,i+1,high);
	}
}

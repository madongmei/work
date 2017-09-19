package allsort;

/**
 * @author Demetria
 * 冒泡排序
 * 思想：比较相邻两个位置的元素的大小，第一轮后确定的是最后一个位置的元素。
 * 复杂度分析：
 * 最好O(n) 最坏O(n^2) 平均O(n^2)
 */
public class BubbleSort {
	public static void main(String[] args) {
		int[] nums={5,3,7,9,1,5,6};
		bubbleSort(nums);
		for(int i=0;i<nums.length;i++){
			System.out.print(nums[i]+" ");
		}
	}

	private static void bubbleSort(int[] nums) {
		for(int i=0;i<nums.length-1;i++){
			for(int j=0;j<nums.length-1-i;j++){
				if(nums[j]>nums[j+1]){
					int temp=nums[j];
					nums[j]=nums[j+1];
					nums[j+1]=temp;
				}
			}
		}
	}
}

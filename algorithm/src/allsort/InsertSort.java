package allsort;

/**
 * @author Demetria
 * 插入排序
 * 思想：假设前面都是有序的数列，将目标元素插入到合适的位置。
 * 复杂度分析：
 * 最好 O(n) 最坏O(n^2) 平均O(n^2)
 */
public class InsertSort {
	public static void main(String[] args) {
		int[] nums={5,3,7,9,1,5,6};
		insertSort(nums);
		for(int i=0;i<nums.length;i++){
			System.out.print(nums[i]+" ");
		}
	}
	
	public static void insertSort(int[] nums){
		for(int i=1;i<nums.length;i++){
			int key=nums[i];
			int j=i;
			if(nums[j-1]>key){
				while(j-1>=0 && nums[j-1]>key){
					nums[j]=nums[j-1];
					j--;
				}
				nums[j]=key;
			}
		}
	}
}

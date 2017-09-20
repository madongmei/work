package allsort;

/**
 * @author Demetria
 * 选择排序
 * 思想：选择合适的数放在合适的位置
 * 复杂度分析：
 * 外层循环（n-1）轮
 * 内存循环（n-1-i）轮
 * 最好 O(n^2) 最坏 O(n^2) 平均 O(n^2)
 */
public class SelectSort {
	public static void main(String[] args) {
		int[] nums={5,3,7,9,1,5,6};
		selectSort(nums);
		for(int i=0;i<nums.length;i++){
			System.out.print(nums[i]+" ");
		}
	}
	
	public static void selectSort(int[] nums){
		for(int i=0;i<nums.length-1;i++){
			for(int j=i+1;j<nums.length;j++){
				if(nums[i]>nums[j]){
					int temp=nums[i];
					nums[i]=nums[j];
					nums[j]=temp;
				}
			}
		}
	}
}

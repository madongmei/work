package allsort;

/**
 * @author Demetria
 * 希尔排序
 * 分段进行插入排序。--缩小增量排序
 * 复杂度分析：
 * 最好O(n) 最坏O(n^s)1<s<2 平均O(nlogn)
 */
public class ShellSort {
	public static void main(String[] args) {
		int[] nums={5,3,7,9,1,5,6};
		shellSort(nums);
		for(int i=0;i<nums.length;i++){
			System.out.print(nums[i]+" ");
		}
	}

	private static void shellSort(int[] nums) {
		int j;
		for(int h=nums.length/2;h>0;h=h/2){
			for(int i=h;i<nums.length;i++){
				int temp=nums[i];
				for(j=i-h;j>=0;j=j-h){
					if(temp<nums[j])
						nums[j+h]=nums[j];
					else
						break;
				}
				nums[j+h]=temp;
			}
		}
	}
}

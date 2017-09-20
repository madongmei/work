package allsort;

/**
 * @author Demetria
 * 堆排序
 * 
 */
public class HeapSort {
	public static void main(String[] args) {
		int[] nums={5,3,7,9,1,5,6};
		heapSort(nums);
		for(int i=0;i<nums.length;i++){
			System.out.print(nums[i]+" ");
		}
	}

	private static void heapSort(int[] nums) {
		int len=nums.length-1;
		for(int i=len/2-1;i>=0;i--){
			adjustHeap(nums,i,len);
		}
		for(int i=len-1;i>=0;i--){
			int temp=nums[0];
			nums[0]=nums[i];
			nums[i]=temp;
			adjustHeap(nums, 0, i-1);
		}
	}

	private static void adjustHeap(int[] nums, int i, int len) {
		int k;
		int temp;
		for(temp=nums[i];2*i+1<=len;i=k){
			k=2*i+1;
			if(k<len && nums[k]<nums[k+1]){
				k++;
			}
			if(nums[k]>temp){
				nums[i]=nums[k];
			}
			else
				break;
		}
		nums[i]=temp;
	}
}

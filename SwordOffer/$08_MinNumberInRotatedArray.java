

public class $08_MinNumberInRotatedArray {
	public static void main(String[] args) {
		//int[] nums={3,4,5,1,2};
		//int[] nums={2,3,4,0,1,2,2,2,2};
		int[] nums={1,1,1,2,0};
		System.out.println(findMinNumber(nums));
	}
	
	public static int findMinNumber(int[] nums){
		int low=0;
		int high=nums.length-1;
		while(low<high){
			int mid=(low+high)/2;
			if(nums[mid]>nums[high]){
				low=mid+1;
			}else if(nums[mid]==nums[high]){
				high--;
			}else{
				high=mid;
			}
		}
		return nums[low];
	}
}

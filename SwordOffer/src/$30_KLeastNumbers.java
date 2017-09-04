import java.util.Arrays;

/**
 * Created by madongmei on 2017/6/8.
 * 输入n个整数，求最小的k个数
 */
public class $30_KLeastNumbers {
    public static void main(String args[]){
        //int[] nums={1,2,2,3,4,5,6};
        //int[] nums={1};
        int[] nums={6,5,4,4,2,2};
        kLeaseNumbers(nums,3);
    }

    public static void kLeaseNumbers(int[] nums,int k){
        Arrays.sort(nums);
        int i=0;
        while(i<nums.length && k>0){
            if(i!=0) {
                if (nums[i] == nums[i-1]) {
                    i++;
                    continue;
                } else {
                    System.out.println(nums[i]);
                    k--;
                    i++;
                }
            }else {
                System.out.println(nums[i]);
                k--;
                i++;
            }
        }
    }
}

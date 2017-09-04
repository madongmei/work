/**
 * Created by madongmei on 2017/6/8.
 * 连续子数组的最大和
 */
public class $31_GreatestSumOfSubArrays {
    public static void main(String args[]){
        //int[] arr={1,2,3,-1,-6,9};
        int[] arr={};
        System.out.print(getGreatestSum(arr));
    }

    public static int getGreatestSum(int[] arr){
        int sum=0;
        int currSum=0;
        for(int i=0;i<arr.length;i++){
            if(currSum>0)
                currSum+=arr[i];
            else
                currSum=arr[i];
            if(sum<currSum)
                sum=currSum;
        }
        return sum;
    }
}

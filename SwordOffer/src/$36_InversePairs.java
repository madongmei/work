/**
 * Created by madongmei on 2017/6/8.
 * 数组中的逆序对
 * 求数组中逆序对的总数
 * 这个解法是O(n^2)
 * 最优解法是O(nlogn)
 */
public class $36_InversePairs {
    public static void main(String args[]){
        int[] arr={7,5,6,4};
        System.out.println(getNumOfInversePairs(arr));
    }

    public static int getNumOfInversePairs(int[] arr){
        int count=0;
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]) {
                    count++;
                }
            }
        }
        return count;
    }
}

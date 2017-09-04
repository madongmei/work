/**
 * Created by madongmei on 2017/6/8.
 * 数字在排序数组中出现的次数
 */
public class $38_NumberOfK {
    public static void main(String args[]){
        int[] arr={1,2,3,4,5,5,5,5,6,7};
        //int[] arr={1};
        System.out.println(getNumberOfK(arr,5));

    }
    public static int getNumberOfK(int[] arr,int k){
        int low=0;
        int high=arr.length-1;
        int mid=0;
        int count=0;
        while(low<high){
            mid=(low+high)/2;
            if(arr[mid]>k)
                high=mid-1;
            else if(arr[mid]<k)
                low=mid+1;
            else {
                count++;
                break;
            }
        }
        int temp1=mid-1;
        int temp2=mid+1;
        while(temp1>=0){
            if(arr[temp1]==k){
                count++;
                temp1--;
            }else
                break;
        }

        while(temp2<arr.length){
            if(arr[temp2]==k){
                count++;
                temp2++;
            }else
                break;
        }
        return count;
    }
}

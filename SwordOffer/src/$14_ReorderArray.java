import javax.xml.soap.SOAPPart;

/**
 * Created by madongmei on 2017/6/5.
 */
public class $14_ReorderArray {
    public static void main(String args[]){
        //int[] arr={1,2,3,4,5};
        //int[] arr={1,2,2,3,4,5,6,6,6};
        //int[] arr={4,4,4,4,4,3,3,3,3,3,3,3,3,3};
        //int[] arr={1,2,3,-1,-2,-3};
        int[] arr={9};
        solution(arr);
        sop(arr);
    }

    public static void solution(int[] arr){
        int low=0;
        int high=arr.length-1;
        while(low<high){
            if(arr[low]%2==0) {
                while (arr[high] % 2 == 0 && low < high)
                    high--;
                int temp = arr[low];
                arr[low] = arr[high];
                arr[high] = temp;
                high--;
            }
            low++;
        }
    }

    public static void sop(int[] arr){
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
}

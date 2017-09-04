/**
 * Created by madongmei on 2017/5/27.
 * the two-demensional array is partiallysorted, we need  to judge whether the key value is in it or not.
 */
public class $3_FindInPartiallySortedMatrix {
    public static void main(String args[]){
        int[][] arr={{1,2,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15}};
        int row=arr.length;
        int col=arr[0].length;
        System.out.println(find(arr,row,col,38));
    }

    public static boolean find(int[][] arr, int row, int col, int key){
        //bool flag=false;
        if(arr!=null && row>0 && col>0){
            int i=0;
            int j=col-1;
            while(i<row && col>=0){
                if(arr[i][j]==key){
                    return true;
                }
                else if(arr[i][j]>key){
                    j--;
                }else{
                    i++;
                }
            }
        }
        return false;
    }
}

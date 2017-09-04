/**
 * Created by madongmei on 2017/6/5.
 * 顺时针打印矩阵
 */
public class $20_PrintMatrix {
    public static void main(String args[]){
        int[][] arr={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        //int[][] arr={{1,2,3,4}};
        //int[][] arr={{1},{2},{3},{4}};
        printMatrixInCircle(arr);
    }

    public static void printMatrixInCircle(int[][] arr){
        if(arr==null)
            return;
        int rows=arr.length;
        int cols=arr[0].length;
        int start=0;
        while(rows>2*start && cols>2*start){
            printOneCircle(arr,start);
            start++;
        }
    }

    public static void printOneCircle(int[][] arr,int start){
        int rows=arr.length;
        int cols=arr[0].length;
        int endX=rows-1-start;
        int endY=cols-1-start;

        //从左到右打印一行
        for(int i=0;i<=endY;i++){
            System.out.print(arr[start][i]);
        }
        //从上到下打印一列
        if(start<endX){
            for(int i=start+1;i<=endX;i++){
                System.out.print(arr[i][endY]);
            }
        }
        //从右到左打印一行
        if(start<endX && start<endY){
            for(int i=endY-1;i>=start;i--){
                System.out.print(arr[endX][i]);
            }
        }
        //从下到上打印一列
        if(start<endX-1 && start<endY){
            for(int i=endX-1;i>=start+1;i--){
                System.out.print(arr[i][start]);
            }
        }
    }
}
















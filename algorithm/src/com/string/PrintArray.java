package com.string;

/**
 * @author Demetria
 * 顺时针打印二维数组
 */
public class PrintArray {
	public static void main(String[] args) {
		int[][] array=new int[][]{{1,2,3},{4,5,6},{7,8,9}};
		printArray(array);
	}
	
	public static void printArray(int[][] array){
		if(array==null)
			return;
		
		int start=0;
		while(array.length>2*start && array[0].length>2*start){
			printOneCircle(array,start);
			start++;
		}
	}
	
	public static void printOneCircle(int[][] array,int start){
		int rows=array.length;
		int cols=array[0].length;
		
		int endx=cols-1-start;
		int endy=rows-1-start;
		
		for(int i=start;i<=endx;i++){
			System.out.println(array[start][i]);
		}
		
		if(start<endy){
			for(int i=start+1;i<=endy;i++){
				System.out.println(array[i][endx]);
			}
		}
		
		if(start<endx && start<endy){
			for(int i=endx-1;i>=start;i--){
				System.out.println(array[endy][i]);
			}
		}
		
		if(start<endy && start<endy-1){
			for(int i=endy-1;i>=start+1;i--){
				System.out.println(array[i][start]);
			}
		}
	}
}

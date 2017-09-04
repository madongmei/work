package com.leetcode.array;

public class GameofLife {
	
	public static void main(String args[]){
		int[][] board={{0,0,1,1,0},{1,1,0,1,0},{1,1,1,0,0}};
		gameOfLife(board);
		for(int i=0;i<board.length;i++){
			for(int j=0;j<board[0].length;j++){
				System.out.print(board[i][j]);
			}
			System.out.println();
		}
	}
	
	public static void gameOfLife(int[][] board) {
        if(board==null || board.length==0 || board[0]==null || board[0].length==0){
        	return;
        }
        
        int m=board.length;//行数
        int n=board[0].length;//列数
        
        for(int i=0;i<m;i++){
        	for(int j=0;j<n;j++){
        		int liveNum=getLiveNum(board,i,j);
        		if(board[i][j]==0){//当前节点处于死亡状态
        			if(liveNum==3){
        				board[i][j]+=10;
        			}
        		}else{//当前节点处于活跃状态
        			if(liveNum==2 || liveNum==3){
        				board[i][j]+=10;
        			}
        		}
        	}
        }
        		
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				board[i][j]=board[i][j]/10;
			}
		}
}

	private static int getLiveNum(int[][] board,int x,int y) {
		int count=0;
		for(int i=x-1;i<=x+1;i++){
			for(int j=y-1;j<=y+1;j++){
				if(i<0 || j<0 || i>board.length-1 || j>board[0].length-1 || (i==x && j==y)){
					continue;
				}
				if(board[i][j]%10==1){
					count++;
				}
			}
		}
		return count;
	}
}

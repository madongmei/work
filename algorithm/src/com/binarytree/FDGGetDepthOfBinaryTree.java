package com.binarytree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Demetria
 * 通过非递归方式求树的深度
 */
public class FDGGetDepthOfBinaryTree {
	public static void main(String[] args) {
		BinaryTree root=BinaryTree.getInstance();
		System.out.println(fdg_getDepth(root));
	}
	
	
	public static int fdg_getDepth(BinaryTree root){
		if(root==null)
			return 0;
		Queue<BinaryTree> q=new LinkedList<BinaryTree>();
		BinaryTree p=root;
		q.add(p);
		int count=0;
		while(!q.isEmpty()){
			int size=q.size();
			while(size>0){
				BinaryTree temp=q.poll();
				if(temp.left!=null)
					q.add(temp.left);
				if(temp.right!=null)
					q.add(temp.right);
				size--;
			}
			
			count++;
		}
		return count;
	}
}

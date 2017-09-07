package com.binarytree;

/**
 * @author Demetria
 * 获取二叉树的深度
 */
public class GetDepthOfBinaryTree {
	public static void main(String[] args) {
		BinaryTree root=BinaryTree.getInstance();
		int depth = getDepth(root);
		System.out.println(depth);
	}
	
	public static int getDepth(BinaryTree root){
		if(root==null)
			return 0;
		int left=getDepth(root.left);
		int right=getDepth(root.right);
		return 1+(left>right?left:right);
	}
}

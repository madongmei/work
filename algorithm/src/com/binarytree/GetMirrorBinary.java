package com.binarytree;

/**
 * @author Demetria
 * 获取一个二叉树的镜像二叉树。
 */
public class GetMirrorBinary {
	public static void main(String[] args) {
		BinaryTree root=BinaryTree.getInstance();
		print(root);
		getSymmetric(root);
		System.out.println();
		print(root);
	}


	private static void getSymmetric(BinaryTree root) {
		if(root==null)
			return;
		BinaryTree temp=root.left;
		root.left=root.right;
		root.right=temp;
		
		if(root.left!=null)
			getSymmetric(root.left);
		if(root.right!=null)
			getSymmetric(root.right);
		
	}	
	
	private static void print(BinaryTree root) {
		System.out.print(root.val);
		if(root.left!=null)
			print(root.left);
		if(root.right!=null)
			print(root.right);
	}
}
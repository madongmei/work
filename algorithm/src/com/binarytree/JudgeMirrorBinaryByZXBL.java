package com.binarytree;

import java.util.ArrayList;

/**
 * @author Demetria
 * 判断一个二叉树是否是镜像的
 * 思想：
 * 通过中序遍历判断是否为回文
 */
public class JudgeMirrorBinaryByZXBL {
	private static StringBuilder list=new StringBuilder();
	public static void main(String[] args) {
		BinaryTree root=BinaryTree.getInstance();
		/*BinaryTree root=new BinaryTree(1);
		BinaryTree r1=new BinaryTree(2);
		BinaryTree r2=new BinaryTree(2);
		BinaryTree r3=new BinaryTree(3);
		BinaryTree r4=new BinaryTree(3);
		BinaryTree r5=new BinaryTree(4);
		BinaryTree r6=new BinaryTree(4);
		
		root.left=r1;
		root.right=r2;
		r1.right=r3;
		r2.left=r4;
		r3.left=r5;
		r4.right=r6;*/
		System.out.println(isSymmetric(root));
	}
	
	
	private static boolean isSymmetric(BinaryTree root) {
		// TODO Auto-generated method stub
		zxbl(root);
		String temp=list.toString();
		return temp.equals(list.reverse().toString());
	}


	public static void zxbl(BinaryTree root){
		if(root.left!=null)
			zxbl(root.left);
		list.append(root.val);
		if(root.right!=null)
			zxbl(root.right);
	}
}

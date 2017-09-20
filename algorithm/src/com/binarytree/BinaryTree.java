package com.binarytree;

public class BinaryTree {
	int val;
	BinaryTree left;
	BinaryTree right;
	
	public BinaryTree(int val){
		this.val=val;
	}
	
	public static BinaryTree getInstance(){
		BinaryTree root=new BinaryTree(1);
		BinaryTree r1=new BinaryTree(2);
		BinaryTree r2=new BinaryTree(3);
		BinaryTree r3=new BinaryTree(4);
		BinaryTree r4=new BinaryTree(5);
		BinaryTree r5=new BinaryTree(6);
		BinaryTree r6=new BinaryTree(7);
		
		root.left=r1;
		root.right=r2;
		r1.left=r3;
		r1.right=r4;
		r2.left=r5;
		r2.right=r6;
		
		return root;
	}
}

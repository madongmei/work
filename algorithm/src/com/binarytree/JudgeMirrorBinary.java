package com.binarytree;

/**
 * @author Demetria
 * �ж�һ���������Ƿ��Ǿ����
 * ˼�룺
 * ��Ϊ�գ����Ǿ����
 * ����Ϊ�գ���Ҫ�жϣ�
 * left.val==right.val && 
 * isSymmetric(left.left, right.right) && 
 * isSymmetric(left.right, right.left);
 */
public class JudgeMirrorBinary {
	public static void main(String[] args) {
		//BinaryTree root=BinaryTree.getInstance();
		BinaryTree root=new BinaryTree(1);
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
		r4.right=r6;
		System.out.println(isSymmetric(root));
	}
	
	public static boolean isSymmetric(BinaryTree root){
		
		//���1����Ϊ��
		if(root==null)
			return true;
		
		//���2������Ϊ��
		return isSymmetric(root.left, root.right);
	}
	
	public static boolean isSymmetric(BinaryTree left, BinaryTree right){
		if(left==null && right==null)
			return true;
		if(left==null || right==null)
			return false;
		return left.val==right.val && isSymmetric(left.left, right.right) && isSymmetric(left.right, right.left);
	}
}

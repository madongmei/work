package com.binarytree;

import java.util.Stack;

/**
 * @author Demetria
 * 前中后遍历用栈stack
 * 前序遍历
 * 循环条件：栈不为空，
 * 循环体：输出栈顶元素p、插入p元素的右子树、插入p元素的左子树。
 */
public class QXBLBianryTree {
	public static void main(String[] args) {
		BinaryTree root=BinaryTree.getInstance();
		qxbl(root);
		System.out.println();
		dg_qxbl(root);
	}
	
	//非递归
	public static void qxbl(BinaryTree root){
		Stack<BinaryTree> s=new Stack<BinaryTree>();
		if(root==null)
			return;
		BinaryTree p=root;
		s.push(p);
		while(!s.isEmpty()){
			p=s.pop();
			System.out.print(p.val);
			if(p.right!=null)
				s.push(p.right);
			if(p.left!=null)
				s.push(p.left);
		}
	}
	
	//递归
	public static void dg_qxbl(BinaryTree root){
		System.out.print(root.val);
		if(root.left!=null)
			dg_qxbl(root.left);
		if(root.right!=null)
			dg_qxbl(root.right);
	}
}

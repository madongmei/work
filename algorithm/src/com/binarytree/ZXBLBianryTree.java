package com.binarytree;

import java.util.Stack;

/**
 * @author Demetria
 * 中序遍历用栈
 * 循环条件：p！=null || !s.isEmpty() 
 * 循环体：
 */
public class ZXBLBianryTree {
	public static void main(String[] args) {
		BinaryTree root=BinaryTree.getInstance();
		
	}
	
	public static void zxbl(BinaryTree root){
		if(root==null)
			return;
		BinaryTree p=root;
		Stack<BinaryTree> s=new Stack<BinaryTree>();
		s.push(p);
		while(p!=null || !s.isEmpty()){
			
		}
	}
}

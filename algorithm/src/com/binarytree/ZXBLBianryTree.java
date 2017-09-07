package com.binarytree;

import java.util.Stack;

/**
 * @author Demetria
 * ���������ջ
 * ѭ��������p��=null || !s.isEmpty() 
 * ѭ���壺
 */
public class ZXBLBianryTree {
	public static void main(String[] args) {
		BinaryTree root=BinaryTree.getInstance();
		zxbl(root);
		System.out.println();
		dg_zxbl(root);
	}
	
	//�ǵݹ�
	public static void zxbl(BinaryTree root){
		if(root==null)
			return;
		BinaryTree p=root;
		Stack<BinaryTree> s=new Stack<BinaryTree>();
		while(p!=null || !s.isEmpty()){
			if(p!=null){
				s.push(p);
				p=p.left;
			}
			else{
				p=s.pop();
				System.out.print(p.val);
				p=p.right;
			}
		}
	}
	
	//�ݹ�
	public static void dg_zxbl(BinaryTree root){
		if(root==null)
			return;
		if(root.left!=null)
			dg_zxbl(root.left);
		System.out.print(root.val);
		if(root.right!=null)
			dg_zxbl(root.right);
	}
}

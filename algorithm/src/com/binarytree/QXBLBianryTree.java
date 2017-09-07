package com.binarytree;

import java.util.Stack;

/**
 * @author Demetria
 * ǰ�к������ջstack
 * ǰ�����
 * ѭ��������ջ��Ϊ�գ�
 * ѭ���壺���ջ��Ԫ��p������pԪ�ص�������������pԪ�ص���������
 */
public class QXBLBianryTree {
	public static void main(String[] args) {
		BinaryTree root=BinaryTree.getInstance();
		qxbl(root);
		System.out.println();
		dg_qxbl(root);
	}
	
	//�ǵݹ�
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
	
	//�ݹ�
	public static void dg_qxbl(BinaryTree root){
		System.out.print(root.val);
		if(root.left!=null)
			dg_qxbl(root.left);
		if(root.right!=null)
			dg_qxbl(root.right);
	}
}

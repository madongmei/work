package com.binarytree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Demetria
 * ��������ö���
 */
public class CXBLBianryTree {
	public static void main(String[] args) {
		BinaryTree root=BinaryTree.getInstance();
		qxbl(root);
		
	}
	
	
	//�ǵݹ�
	public static void qxbl(BinaryTree root){
		Queue<BinaryTree> q=new LinkedList<BinaryTree>();
		if(root==null)
			return;
		BinaryTree p=root;
		q.offer(p);
		while(!q.isEmpty()){
			p=q.poll();
			System.out.println(p.val);
			if(p.left!=null)
				q.offer(p.left);
			if(p.right!=null)
				q.offer(p.right);
		}
	}
}

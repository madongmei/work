package com.binarytree;

import java.util.LinkedList;
import java.util.Queue;

public class FDGGetMirrorBinary {
	public static void main(String[] args) {
		BinaryTree root=BinaryTree.getInstance();
		root=fdgGetMirrorBinary(root);
		CXBLBianryTree.cxbl(root);//≤„–Ú±È¿˙
		
	}
	
	public static BinaryTree fdgGetMirrorBinary(BinaryTree root){
		if(root==null)
			return root;
		
		BinaryTree node=root;
		Queue<BinaryTree> q=new LinkedList<BinaryTree>();
		q.add(node);
		while(!q.isEmpty()){
			BinaryTree temp=q.poll();
			swap(temp);
			if(temp.left!=null)
				q.add(temp.left);
			if(temp.right!=null)
				q.add(temp.right);
		}
		
		return root;
	}
	
	public static void swap(BinaryTree node){
		if(node==null)
			return;
		BinaryTree temp=node.left;
		node.left=node.right;
		node.right=temp;
	}
}

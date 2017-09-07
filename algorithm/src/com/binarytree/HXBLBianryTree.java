package com.binarytree;

import java.util.Stack;

/**
 * @author Demetria
 *
 */
public class HXBLBianryTree {
	public static void main(String[] args) {
		BinaryTree root=BinaryTree.getInstance();
		hxbl(root);
		System.out.println();
		dg_hxbl(root);
	}
	
	public static void hxbl(BinaryTree root){
		Stack<BinaryTree> s=new Stack<BinaryTree>();
		BinaryTree p=root;
		BinaryTree pre=p;
		while(p!=null || !s.isEmpty()){
			if(p!=null){
				s.push(p);
				p=p.left;
			}
			else{
				if(s.isEmpty())
					return;
				p=s.peek();
				if(p.right!=null && p.right!=pre){
					p=p.right;
				}
				else{
					p=s.pop();
					System.out.print(p.val);
					pre=p;
					p=null;
				}
			}
		}
	}
	
	public static void dg_hxbl(BinaryTree root){
		if(root==null)
			return;
		if(root.left!=null)
			dg_hxbl(root.left);
		if(root.right!=null)
			dg_hxbl(root.right);
		System.out.print(root.val);
	}
}

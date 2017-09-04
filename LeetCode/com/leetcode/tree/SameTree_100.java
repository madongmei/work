package com.leetcode.tree;

/**
 * @author Demetria
 * 题意：比较两个二叉树，判断二叉树的结构和每个对应结点的值是否相等，完全一致则返回true，不一致则返回false;
 */
public class SameTree_100 {

	public static void main(String args[]){
		TreeNode p=new TreeNode(2);
		TreeNode pl=new TreeNode(3);
		TreeNode pr=new TreeNode(4);
		p.left=pl;
		p.right=pr;
		
		TreeNode q=new TreeNode(2);
		TreeNode ql=new TreeNode(3);
		TreeNode qr=new TreeNode(4);
		TreeNode ql1=new TreeNode(4);
		q.left=ql;
		q.right=qr;
//		qr.left=ql1;
		
		System.out.println(isSameTree(p, q));
	}
	
	public static boolean isSameTree(TreeNode p, TreeNode q) {
		
		if(p==null && q==null)
			return true;
		boolean f1=true;
		boolean f2=true;
        if(p!=null && q!=null){
        	if(p.val==q.val){
        		f1=isSameTree(p.left, q.left);
        		f2=isSameTree(p.right, q.right);
        		if(!f1 || !f2)
        			return false;
        	}else{
        		return false;
        	}
        }else{
        	return false;
        }
        return true;
    }
}

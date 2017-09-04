package com.leetcode.tree;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 * 
 * AC代码：
 * 不要想复杂了，就是交换左右子结点
 */
public class InvertBinaryTree_226 {

	public static void main(String args[]){
	
		TreeNode root=new TreeNode(4);
		TreeNode le1=new TreeNode(2);
		TreeNode ri1=new TreeNode(7);
		TreeNode le2_1=new TreeNode(1);
		TreeNode ri2_1=new TreeNode(3);
		TreeNode le2_2=new TreeNode(6);
		TreeNode ri2_2=new TreeNode(9);
		root.left=le1;
		root.right=ri1;
		le1.left=le2_1;
		le1.right=ri2_1;
		ri1.left=le2_2;
		ri1.right=ri2_2;
		
		invertTree(root);
		System.out.println(root.val+".."+le1.val+".."+ri1.val+".."+le2_1.val+".."+ri2_1.val+".."+le2_2.val+".."+ri2_2.val);
	}
	
	
	//AC代码
	public static TreeNode invertTree(TreeNode root) {
		if(root==null)
            return root;
    	TreeNode temp=root.left;
    	root.left=root.right;
    	root.right=temp;
    	invertTree(root.right);
    	invertTree(root.left);
    	return root;
    }
	
	//discuss代码
	public static TreeNode invertTree1(TreeNode root) {
	    if(root == null) {
	        return root;
	    }
	    TreeNode temp = root.left;
	    root.left = root.right;
	    root.right = temp;
	    
	    invertTree(root.left);
	    invertTree(root.right);
	    
	    return root;
	}
}

class TreeNode {
	 int val;
	 TreeNode left;
	 TreeNode right;
	 TreeNode(int x) { val = x; }
}

package com.leetcode.tree;

/**
 * @author Demetria
 * ���⣺��һ����������������Ҷ��ֵ�ĺ�
 * ע������Ҷ�ӽ��ĺ͡�
 */
public class SumofLeftLeaves {

	public static void main(String args[]){
		TreeNode root=new TreeNode(-9);
		TreeNode le1=new TreeNode(-3);
		TreeNode ri1=new TreeNode(-2);
		TreeNode ri2_1=new TreeNode(4);
		TreeNode le2_2=new TreeNode(4);
		TreeNode ri2_2=new TreeNode(0);
		TreeNode le3_1=new TreeNode(-6);
		TreeNode le3_2=new TreeNode(-5);
		
		root.left=le1;
		root.right=ri1;
		le1.right=ri2_1;
		ri1.left=le2_2;
		ri1.right=ri2_2;
		ri2_1.left=le3_1;
		le2_2.left=le3_2;
		System.out.println(sumOfLeftLeaves(root));
	}
	
	public static int sumOfLeftLeaves(TreeNode root) {
	     if(root==null){
	    	 return 0;
	     }
	     int sum=0;
	     if(root.left!=null){
	    	 if((root.left.left==null) && (root.left.right==null)){//�ж��Ƿ�ΪҶ�ӽڵ�
	    		 sum+=root.left.val;
	    		 sum+=sumOfLeftLeaves(root.right);
	    	 }else{
	    		 sum+=sumOfLeftLeaves(root.right);
		    	 sum+=sumOfLeftLeaves(root.left);
	    	 }
	     }else{
	    	 sum+=sumOfLeftLeaves(root.right);
	     }
	     return sum;
	}
}

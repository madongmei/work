package com.binarytree;

import java.util.ArrayList;

/**
 * @author Demetria
 * 二叉树中和为某一值的所有路径，从根节点开始
 */
public class GetAllPath {
	private static ArrayList<ArrayList<Integer>> listAll=new ArrayList<ArrayList<Integer>>();
	private static ArrayList<Integer> list=new ArrayList<Integer>();
	
	public static void main(String[] args) {
		BinaryTree root=BinaryTree.getInstance();
		int target=10;
		findPath(root, target);
		for(int i=0;i<listAll.size();i++){
			ArrayList<Integer> temp=listAll.get(i);
			for(int j=0;j<temp.size();j++){
				System.out.println(temp.get(j)+",");
			}
		}
		
	}
	
	public static ArrayList<ArrayList<Integer>> findPath(BinaryTree root, int target){
		if(root==null)
			return listAll;
		list.add(root.val);
		target=target-root.val;
		if(target==0 && root.left==null && root.right==null){
			listAll.add(list);
		}
		
		findPath(root.left, target);
		findPath(root.right,target);
		
		list.remove(list.size()-1);
		return listAll;
	}
}

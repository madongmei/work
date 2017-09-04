package com.leetcode.tree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.List;
import java.util.Stack;

/*
 * 二叉树的数据结构
 * >每个节点都有值；
 * >度数为2的节点有左右子节点；
 * >节点的最大度数为2；
 * */
public class BinaryTree {
	int val;
	BinaryTree left;
	BinaryTree right;
	
	BinaryTree(int val){
		this.val=val;
	}
	
	public static void main(String args[]){
		BinaryTree root=new BinaryTree(3);
		BinaryTree l1=new BinaryTree(9);
		BinaryTree r1=new BinaryTree(20);
		BinaryTree l2=new BinaryTree(15);
		BinaryTree r2=new BinaryTree(7);
//		BinaryTree l3=new BinaryTree(20);
//		BinaryTree r3=new BinaryTree(8);
		
		root.left=l1;
		root.right=r1;
		
		r1.left=l2;
		r1.right=r2;
		
//		l2.left=l3;
//		l2.right=r3;
		
		
//		depthFirst(root);
//		widthFirst(root);
//		root=null;
		System.out.println(levelOrderBottom(root));
	}
	
	/**
	 * 深度优先遍历
	 * */
	public static void depthFirst(BinaryTree root){
		Stack<BinaryTree> nodeStack = new Stack<BinaryTree>();
		BinaryTree tempNode=null;
		nodeStack.push(root);
		while(!nodeStack.isEmpty()){
			tempNode=nodeStack.pop();
			System.out.println(tempNode.val);
			
			if(tempNode.right!=null){
				nodeStack.push(tempNode.right);
			}
			
			if(tempNode.left!=null){
				nodeStack.push(tempNode.left);
			}
		}
	}
	
	/**
	 * 
	 * 广度优先遍历
	 * 
	 * */
	
	public static void widthFirst(BinaryTree root){
		 Deque<BinaryTree> nodeDeque = new ArrayDeque<BinaryTree>();
		 nodeDeque.add(root);
		 BinaryTree tempNode=null;
		 while(!nodeDeque.isEmpty()){
			 tempNode=nodeDeque.pollFirst();
			 System.out.println(tempNode.val);
			 
			 if(tempNode.left!=null){
				 nodeDeque.add(tempNode.left);
			 }
			 if(tempNode.right!=null){
				 nodeDeque.add(tempNode.right);
			 }
		 }
	}
	
	//使用广度优先搜索解决leetcode107问题
	public static List<List<Integer>> levelOrderBottom(BinaryTree root) {
		List<List<Integer>> list=new ArrayList<List<Integer>>();
		if(root==null)
			return list;
        Deque<BinaryTree> nodeQueue = new ArrayDeque<BinaryTree>();
		BinaryTree tempNode=null;
		nodeQueue.add(root);
		while(!nodeQueue.isEmpty()){
			int len=nodeQueue.size();
			List<Integer> li=new ArrayList<Integer>();
			for(int i=0;i<len;i++){
				tempNode=nodeQueue.poll();
				if(tempNode.left!=null){
					nodeQueue.add(tempNode.left);
				}
				
				if(tempNode.right!=null){
					nodeQueue.add(tempNode.right);
				}
				li.add(tempNode.val);
			}
			
			list.add(li);
		}
		Collections.reverse(list);
		return list;
    }
}


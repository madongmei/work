package com.leetcode.tree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.List;
import java.util.Stack;

/*
 * �����������ݽṹ
 * >ÿ���ڵ㶼��ֵ��
 * >����Ϊ2�Ľڵ��������ӽڵ㣻
 * >�ڵ��������Ϊ2��
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
	 * ������ȱ���
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
	 * ������ȱ���
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
	
	//ʹ�ù�������������leetcode107����
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


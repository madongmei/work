package com.binarytree;

import java.util.ArrayList;
import java.util.Stack;

/**
 * @author Demetria
 * �������к�Ϊĳһֵ������·�����Ӹ��ڵ㿪ʼ
 */
public class GetAllPathByStack {
	private static ArrayList<ArrayList<Integer>> listAll=new ArrayList<ArrayList<Integer>>();
	private static ArrayList<Integer> list=new ArrayList<Integer>();
	
	public static void main(String[] args) {
		BinaryTree root=BinaryTree.getInstance();
		int target=10;
		findPath(root, target);		
	}
	
	public static void findPath(BinaryTree root,int k){    
	       if(root == null)    
	           return;    
	       Stack<Integer> stack = new Stack<Integer>();    
	       findPath(root,k,stack);    
	   }    
	   public static void findPath(BinaryTree root,int k,Stack<Integer> path){    
	       if(root == null)    
	           return;    
	       if(root.left == null && root.right == null){    
	           if(root.val == k){    
	               System.out.println("·����ʼ");    
	               for(int i :path)    
	                   System.out.print(i+",");    
	               System.out.print(root.val);    
	           }    
	       }    
	       else{    
	           path.push(root.val);    
	           findPath(root.left,k-root.val,path);    
	           findPath(root.right,k-root.val,path);    
	           path.pop();    
	       }    
	   }    
}

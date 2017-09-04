package com.leetcode.linkedlist;
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

/**
 * 合并两个已排好序的链表，需要对两个链表的元素进行比较。
 * （1）如果l1==null,那么需要将l2后面的节点都接到新的混合后的链表的后面；
 * （2）如果l2==null,那么需要将l1后面的节点都接到新的混合后的链表的后面；
 * （3）如果l1和l2都不为空。那么比较l1和l2的值。
 * if(l1.val>l2.val)链表后面接l2;
 * if(l2.val>l1.val)链表后面接l1;
 * 
 * 需要注意的是，头节点的问题。如果头结点为空，那么赋予值；不为空的话，为temp.next赋值。
 *
 * */
public class Merge_Two_Sorted_Lists_21 {
	public static void main(String args[]){
		ListNode root1=new ListNode(1);
		ListNode f1=new ListNode(3);
		ListNode f2=new ListNode(5);
		ListNode f3=new ListNode(7);
		
		root1.next=f1;
		f1.next=f2;
		f2.next=f3;
		
		ListNode root2=new ListNode(2);
		ListNode s1=new ListNode(4);
		ListNode s2=new ListNode(6);
		ListNode s3=new ListNode(8);
		ListNode s4=new ListNode(10);
		
		root2.next=s1;
		s1.next=s2;
		s2.next=s3;
		s3.next=s4;
		
		ListNode node=mergeTwoLists(root1, root2);
		while(node!=null){
			System.out.println(node.val);
			node=node.next;
		}
	}
	
	public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1==null)
        	return l2;
        if(l2==null)
        	return l1;
        ListNode head=null;
        ListNode temp=null;
        while(l1!=null || l2!=null){
        	
        	if(l1==null){
        		System.out.println("00000:"+l2.val);
        		temp.next=l2;
        		temp=temp.next;
        		l2=l2.next;
        		continue;
        	}
        	
        	if(l2==null){
        		System.out.println(l1.val);
        		temp.next=l1;
        		temp=temp.next;
        		l1=l1.next;
        		continue;
        	}
        	
        	
        	if(l1.val>l2.val){
        		if(head==null){
        			temp=new ListNode(l2.val);
        			head=temp;
        		}else{
	        		temp.next=new ListNode(l2.val);
	        		temp=temp.next;
	        	}
        		l2=l2.next;
        	}else{
        		if(head==null){
        			temp=new ListNode(l1.val);
        			head=temp;
        		}else{
	        		temp.next=new ListNode(l1.val);
	        		temp=temp.next;
        		}
        		l1=l1.next;
        	}
        }
        return head;
    }
}

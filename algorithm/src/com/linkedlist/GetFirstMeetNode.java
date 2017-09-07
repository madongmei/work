package com.linkedlist;

import com.binarytree.BinaryTree;

/**
 * @author Demetria
 * 获得两个链表相交的第一个交点。
 * 先判断两个链表是否相交，相交再求第一个交点。
 */
public class GetFirstMeetNode {
	public static void main(String[] args) {
		ListNode head1=new ListNode(1);
		ListNode n1=new ListNode(3);
		ListNode n2=new ListNode(5);
		ListNode n3=new ListNode(7);
		head1.next=n1;
		n1.next=n2;
		n2.next=n3;
		
		ListNode head2=new ListNode(2);
		ListNode h1=new ListNode(4);
		ListNode h2=new ListNode(6);
		head2.next=h1;
		h1.next=h2;
		h2.next=n1;
		ListNode meetNode=getFirstMeetNode(head1, head2);
		if(meetNode!=null)
			System.out.println(meetNode.val);
		else
			System.out.println("no meet node");
	}
	
	public static ListNode getFirstMeetNode(ListNode head1, ListNode head2){
		boolean isIntersect=IsIntersect.isIntersect(head1, head2);
		if(isIntersect==false)
			return null;
		int len1=0;
		int len2=0;
		ListNode h1=head1;
		ListNode h2=head2;
		while(h1!=null){
			len1++;
			h1=h1.next;
		}
		
		while(h2!=null){
			len2++;
			h2=h2.next;
		}
		
		ListNode r1=head1;
		ListNode r2=head2;
		if(len1>len2){
			int k=len1-len2;
			while(k>0){
				r1=r1.next;
				k--;
			}
		}else{
			int k=len2-len1;
			while(k>0){
				r2=r2.next;
				k--;
			}
		}
		
		while(r1!=r2){
			r1=r1.next;
			r2=r2.next;
		}
		return r1;
	}
}

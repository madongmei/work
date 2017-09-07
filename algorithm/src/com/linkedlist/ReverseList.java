package com.linkedlist;

import java.util.LinkedList;

/**
 * @author Demetria
 * ·´×ªÁ´±í
 */
public class ReverseList {
	public static void main(String[] args) {
		ListNode n1=ListNode.getInstance();
		print(n1);
		n1=reverseList(n1);
		print(n1);
	}

	private static ListNode reverseList(ListNode head) {
		if(head==null)
			return head;
		
		ListNode temp=head;
		ListNode preNode=null;
		ListNode newHead=null;
		
		while(temp!=null){
			ListNode nextNode=temp.next;
			if(nextNode==null)
				newHead=temp;
			
			temp.next=preNode;
			preNode=temp;
			temp=nextNode;
		}
		return newHead;
	}
	
	
	private static void print(ListNode head) {
		if(head==null)
			return;
		while(head.next!=null){
			System.out.print(head.val+"->");
			head=head.next;
		}
		System.out.println(head.val);
	}
}

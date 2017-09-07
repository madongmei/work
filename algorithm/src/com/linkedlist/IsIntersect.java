package com.linkedlist;

/**
 * @author Demetria
 * 判断两个链表是否相交
 */
public class IsIntersect {
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
		
		System.out.println(isIntersect(head1, head2));
	}
	
	public static boolean isIntersect(ListNode head1, ListNode head2){
		if(head1==null || head2==null)
			return false;
		
		ListNode n1=head1;
		ListNode n2=head2;
		while(n1.next!=null){
			n1=n1.next;
		}
		
		while(n2.next!=null){
			n2=n2.next;
		}
		return n1==n2;
	}
}

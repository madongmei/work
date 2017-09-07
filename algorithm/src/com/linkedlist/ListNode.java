package com.linkedlist;

public class ListNode {
	int val;
	ListNode next;
	public ListNode(int val){
		this.val=val;
	}
	
	public static ListNode getInstance(){
		ListNode n1=new ListNode(1);
		ListNode n2=new ListNode(2);
		ListNode n3=new ListNode(3);
		ListNode n4=new ListNode(4);
		ListNode n5=new ListNode(5);
		n1.next=n2;
		n2.next=n3;
		n3.next=n4;
		n4.next=n5;
		n5.next=n3;//去掉注释就是有环了
		
		return n1;
	}
}

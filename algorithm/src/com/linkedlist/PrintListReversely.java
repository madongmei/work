package com.linkedlist;

/**
 * @author Demetria
 * ���������������Ԫ��
 */
public class PrintListReversely {
	public static void main(String[] args) {
		ListNode head=ListNode.getInstance();
		printListReversely(head);
	}
	
	public static void printListReversely(ListNode head){
		if(head==null)
			return;
		if(head!=null){
			printListReversely(head.next);
			System.out.println(head.val);
		}
	}
}

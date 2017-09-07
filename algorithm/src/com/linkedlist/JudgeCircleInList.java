package com.linkedlist;

/**
 * @author Demetria
 * 判断链表中是否有环
 */
public class JudgeCircleInList {
	public static void main(String[] args) {
		ListNode head=ListNode.getInstance();
		System.out.println(isCircle(head));
	}
	
	public static boolean isCircle(ListNode head){
		if(head==null)
			return false;
		
		ListNode fast=head;
		ListNode slow=head;
		while(fast!=null && fast.next!=null){
			fast=fast.next.next;
			slow=slow.next;
			
			if(fast==slow)
				return true;
		}
		
		return fast!=null && fast.next!=null;
	}
}

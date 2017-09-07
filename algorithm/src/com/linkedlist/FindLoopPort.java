package com.linkedlist;

/**
 * @author Demetria
 * 链表如果有环，找到环的入口
 */
public class FindLoopPort {
	public static void main(String[] args) {
		ListNode head=ListNode.getInstance();
		ListNode loopPort=findLoopPort(head);
		if(loopPort!=null)
			System.out.println(loopPort.val);
		else
			System.out.println("no circle in list.");
	}
	
	public static ListNode findLoopPort(ListNode head){
		if(head==null)
			return head;
		ListNode fast=head;
		ListNode slow=head;
		while(fast!=null && fast.next!=null){
			fast=fast.next.next;
			slow=slow.next;
			
			if(fast==slow)
				break;
		}
		
		if(fast==null || fast.next==null)
			return null;
		
		slow=head;
		while(slow!=fast){
			slow=slow.next;
			fast=fast.next;
		}
		return slow;
	}
}

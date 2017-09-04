package com.leetcode.linkedlist;

public class RemoveDuplicatesfromSortedList_83 {

	public static void main(String args[]){
		ListNode n1=new ListNode(1);
		ListNode n2=new ListNode(1);
		ListNode n3=new ListNode(2);
		ListNode n4=new ListNode(3);
		ListNode n5=new ListNode(3);
		n1.next=n2;
		n2.next=n3;
		n3.next=n4;
		n4.next=n5;
		
		n1=deleteDuplicates(null);
		System.out.println(n1.val);
		System.out.println(n1.next.val);
		System.out.println(n1.next.next.val);
	}
	
	public static ListNode deleteDuplicates(ListNode head) {
		if(head==null)
	        return head;
		
		ListNode next=head.next;
        ListNode curr=head;
       
        while(curr.next!=null){
        	if(curr.val==next.val){
        		curr.next=next.next;
        		next=curr.next;
        	}else{
        		curr=next;
        		next=next.next;
        	}
        }
        return head;
    }
}

package com.leetcode.linkedlist;

/**
 * @author Demetria
 *
 */

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class ReverseLinkedList_206 {

	public static void main(String args[]){
		ListNode l1=new ListNode(0);
		ListNode l2=new ListNode(1);
		ListNode l3=new ListNode(2);
		l1.next=l2;
		l2.next=l3;
		l3.next=null;
		 
		ListNode keyNode=reverseList(l1);
		System.out.println(keyNode.val);
		System.out.println(keyNode.next.val);
		System.out.println(keyNode.next.next.val);
	}
	
	public static ListNode reverseList(ListNode head) {
		if(head==null||head.next==null) return head;
        ListNode prev, curr, next;
        prev = null;
        curr = head;
        next = null;
        
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
}


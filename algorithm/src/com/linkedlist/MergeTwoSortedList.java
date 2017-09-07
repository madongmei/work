package com.linkedlist;

/**
 * @author Demetria
 * 合并两个有序链表，使之成为有序的
 */
public class MergeTwoSortedList {
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
		
		print(mergeTwoSortedList(head1, head2));
		System.out.println();
		//print(dg_mergeTwoSortedList(head1, head2));
		
	}
	
	//非递归
	public static ListNode mergeTwoSortedList(ListNode head1, ListNode head2){
		if(head1==null && head2==null)
			return null;
		if(head1==null)
			return head2;
		if(head2==null)
			return head1;
		
		ListNode h1=head1;
		ListNode h2=head2;
		ListNode newHead=new ListNode(0);
		ListNode node=newHead;
		while(h1!=null || h2!=null){
			if(h1!=null && h2!=null){
				if(h1.val<h2.val){
					node.next=h1;
					node=node.next;
					h1=h1.next;
				}else{
					node.next=h2;
					node=node.next;
					h2=h2.next;
				}
			}
			else if(h1!=null){
				while(h1!=null){
					node.next=h1;
					h1=h1.next;
					node=node.next;
				}
			}else if(h2!=null){
				while(h2!=null){
					node.next=h2;
					h2=h2.next;
					node=node.next;
				}
			}
		}
		newHead.val=newHead.next.val;
		newHead.next=newHead.next.next;
		return newHead;
	}
	
	//递归
	public static ListNode dg_mergeTwoSortedList(ListNode head1, ListNode head2){
		if(head1==null && head2==null)
			return null;
		if(head1==null)
			return head2;
		if(head2==null)
			return head1;
		
		ListNode temp=null;
		if(head1.val<head2.val){
			temp=head1;
			temp.next=dg_mergeTwoSortedList(head1.next, head2);
		}else{
			temp=head2;
			temp.next=dg_mergeTwoSortedList(head1, head2.next);
		}
		return temp;
	}
	
	public static void print(ListNode head){
		if(head==null)
			return;
		while(head.next!=null){
			System.out.print(head.val+"->");
			head=head.next;
		}
		System.out.println(head.val);
	}
}

package com.leetcode.linkedlist;

/**
 * @author Demetria
 * 实际上删除的是目标node后面的node，只是将后面node的值赋给了目标node，然后将后面的node删除。
 */

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class DeleteNodeinaLinkedList_237 {
	
	public void deleteNode(ListNode node) {
        
        node.val=node.next.val;
        node.next=node.next.next;
    }

}

class ListNode{
	int val;
	ListNode next;
	ListNode(int val){
		this.val=val;
	}
	
}

package com.leetcode.linkedlist;

/**
 * @author Demetria
 * ʵ����ɾ������Ŀ��node�����node��ֻ�ǽ�����node��ֵ������Ŀ��node��Ȼ�󽫺����nodeɾ����
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

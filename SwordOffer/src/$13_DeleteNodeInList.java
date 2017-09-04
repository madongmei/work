/**
 * Created by madongmei on 2017/6/5.
 * 时间复杂度 O(n)
 */
public class $13_DeleteNodeInList {
    public static void main(String args[]) {
        ListNode head=new ListNode(1);
        ListNode l1=new ListNode(2);
        ListNode l2=new ListNode(3);
        ListNode l3=new ListNode(4);
        ListNode l4=new ListNode(5);
        ListNode l5=new ListNode(6);
        head.next=l1;
        l1.next=l2;
        l2.next=l3;
        l3.next=l4;
        l4.next=l5;
        System.out.println( "before:");
        print(head);
        delete(head,l5);
        System.out.println("after:");
        print(head);
    }

    public static void delete(ListNode head, ListNode node) {
        if(head==null || node==null)
            return;

        //删除的不是尾节点
        if(node.next!=null){
            node.val=node.next.val;
            node.next=node.next.next;
        }
        else if(head==node){//删除的是尾节点，且链表只有一个节点
            head=null;
            node=null;
        }else{//删除的是尾节点，但链表有多个节点
            ListNode temp=head;
            while(temp.next!=node){
                temp=temp.next;
            }

            temp.next=null;
        }
    }

    public static void print(ListNode node){
        while(node.next!=null) {
            System.out.print(node.val + "->");
            node = node.next;
        }
        System.out.print(node.val);
        System.out.println();
    }
}
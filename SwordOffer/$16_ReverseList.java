/**
 * Created by madongmei on 2017/6/5.
 */
public class $16_ReverseList {
    public static void main(String args[]){
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
        print(head);
        System.out.println("--------------------");
        ListNode node=reverseList(head);
        print(node);

    }
    public static ListNode reverseList(ListNode head){
        ListNode temp=head;
        ListNode newHead=null;
        ListNode preNode=null;

        while(temp!=null){
            ListNode next=temp.next;
            if(temp.next==null)
                newHead=temp;
            temp.next=preNode;
            preNode=temp;
            temp=next;
        }
        return newHead;
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

/**
 * Created by madongmei on 2017/6/5.
 */
public class $15_KthNodeFromEnd {
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
        System.out.println(solution(head,0));
    }

    public static int solution(ListNode head,int k){
        ListNode temp=head;
        ListNode fast=head;
        ListNode slow=head;
        int len=0;
        while(temp!=null){
            len++;
            temp=temp.next;
        }
        if(k>len || k<=0)
            return -1;
        if(k==len)
            return head.val;
        while(k>0){
            fast=fast.next;
            k--;
        }
        System.out.println("fast:"+fast.val);
        while(fast!=null){
            fast=fast.next;
            slow=slow.next;
        }
        return slow.val;
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

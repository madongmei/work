/**
 * Created by madongmei on 2017/6/5.
 * 合并两个有序列表,使合并后的链表仍是有序的。
 * 非递归解法+递归解法
 */
public class $17_MergeSortedList {
    public static void main(String args[]){
        ListNode h1=new ListNode(1);
        ListNode l1=new ListNode(2);
        ListNode l2=new ListNode(4);
        ListNode l3=new ListNode(7);
        h1.next=l1;
        l1.next=l2;
        l2.next=l3;

        ListNode h2=new ListNode(3);
        ListNode k1=new ListNode(4);
        ListNode k2=new ListNode(8);
        ListNode k3=new ListNode(9);
        h2.next=k1;
        k1.next=k2;
        k2.next=k3;
        System.out.print("list1:");
        print(h1);
        System.out.print("list2:");
        print(h2);
        System.out.print("merge:");

        long b1=System.currentTimeMillis();
        ListNode newHead=merge(h1,h2);
        long e1=System.currentTimeMillis();
        long time1=e1-b1;
        System.out.println("非递归用时："+time1);
        print(newHead);

        long b2=System.currentTimeMillis();
        ListNode newHead1=merge1(h1,h2);
        long e2=System.currentTimeMillis();
        long time2=e2-b2;
        System.out.println("递归用时："+time2);
        print(newHead1);
    }

    //非递归解法
    public static ListNode merge(ListNode head1,ListNode head2){
        if(head1==null)
            return head2;
        if(head2==null)
            return head1;
        ListNode list=new ListNode(0);
        ListNode node=list;
        ListNode temp1=head1;
        ListNode temp2=head2;

        while(temp1!=null || temp2!=null){
            if(temp1!=null && temp2!=null){
                if(temp1.val>temp2.val){
                    list.next=new ListNode(temp2.val);
                    list=list.next;
                    temp2=temp2.next;
                }else{
                    list.next=new ListNode(temp1.val);
                    list=list.next;
                    temp1=temp1.next;
                }
            }else if(temp1!=null){
                while(temp1!=null){
                    list.next=new ListNode(temp1.val);
                    list=list.next;
                    temp1=temp1.next;
                }
            }else{
                while(temp2!=null){
                    list.next=new ListNode(temp2.val);
                    list=list.next;
                    temp2=temp2.next;
                }
            }
        }
        node.val=node.next.val;
        node.next=node.next.next;
        return node;
    }

    //递归解法
    public static ListNode merge1(ListNode head1,ListNode head2){
        if(head1==null)
            return head2;
        if(head2==null)
            return head1;
        ListNode newHead=null;
        if(head1.val<head2.val){
            newHead=head1;
            newHead.next=merge1(head1.next,head2);
        }
        else{
            newHead=head2;
            newHead.next=merge1(head1,head2.next);
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

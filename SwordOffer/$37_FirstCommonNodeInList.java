import java.util.List;

/**
 * Created by madongmei on 2017/6/8.
 * 两个链表的第一个公共节点
 */
public class $37_FirstCommonNodeInList {
    public static void main(String args[]){
        ListNode h1=new ListNode(1);
        ListNode a1=new ListNode(2);
        ListNode a2=new ListNode(3);
        ListNode a3=new ListNode(4);
        ListNode a4=new ListNode(5);
        h1.next=a1;
        a1.next=a2;
        a2.next=a3;
        a3.next=a4;

        ListNode h2=new ListNode(7);
        ListNode b1=new ListNode(8);
        ListNode b2=new ListNode(9);
        h2.next=b1;
        b1.next=b2;
        //b2.next=a4;
        if(findFirstNode(h1,h2)!=null)
            System.out.print(findFirstNode(h1,h2).val);

    }

    public static ListNode findFirstNode(ListNode head1,ListNode head2){
        ListNode n1=head1;
        ListNode n2=head2;
        int len1=0;
        int len2=0;

        while(n1.next!=null){
            n1=n1.next;
            len1++;
        }
        len1++;

        while(n2.next!=null){
            n2=n2.next;
            len2++;
        }
        len2++;
        //System.out.println(len1+"..."+len2);
        if(n1!=n2)
            return null;//没有交点

        ListNode r1=head1;
        ListNode r2=head2;
        if(len1>len2){
            int d=len1-len2;
            while(d>0) {
                r1 = r1.next;
                d--;
            }
        }else{
            int d=len2-len1;
            while(d>0){
                r2=r2.next;
                d--;
            }
        }
        while(r1!=r2){
            r1=r1.next;
            r2=r2.next;
        }
        return r1;
    }

}

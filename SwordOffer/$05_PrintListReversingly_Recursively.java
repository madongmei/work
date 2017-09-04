/**
 * Created by madongmei on 2017/5/27.
 * print the list's node from the last to the first.
 */
class ListNode{

    ListNode next;
    int val;
    ListNode(int val) {
        this.val = val;
    }
}
public class $5_PrintListReversingly_Recursively {
    public static void main(String args[]){
        ListNode head=new ListNode(1);
        ListNode n1=new ListNode(2);
        ListNode n2=new ListNode(3);
        ListNode n3=new ListNode(4);
        ListNode n4=new ListNode(5);
        head.next=n1;
        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        print(head);
        printListReversingly_Recursively(head);
    }

    public static void printListReversingly_Recursively(ListNode head){
        if(head!=null){
            if(head.next!=null){
                printListReversingly_Recursively(head.next);
            }
            System.out.print(head.val);
        }
    }

    public static void print(ListNode node){
        while(node!=null){
            if(node.next!=null)
                System.out.print(node.val+"-->");
            else
                System.out.print(node.val);
            node=node.next;
        }
        System.out.println();
    }
}

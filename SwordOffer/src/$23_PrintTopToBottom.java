/**
 * Created by madongmei on 2017/6/6.
 * 层序遍历二叉树
 */
import java.util.Queue;
import java.util.LinkedList;
public class $23_PrintTopToBottom {
    public static void main(String args[]){
        BinaryTree root=new BinaryTree(8);
        BinaryTree n1=new BinaryTree(6);
        BinaryTree n2=new BinaryTree(10);
        BinaryTree n3=new BinaryTree(5);
        BinaryTree n4=new BinaryTree(7);
        BinaryTree n5=new BinaryTree(9);
        BinaryTree n6=new BinaryTree(11);

        root.left=n1;
        root.right=n2;
        n1.left=n3;
        n1.right=n4;
        n2.left=n5;
        n2.right=n6;
        printTopToBottom(root);
    }

    public static void printTopToBottom(BinaryTree root){
        if(root==null)
            return;

        Queue<BinaryTree> q=new LinkedList<BinaryTree>();
        q.add(root);
        while(!q.isEmpty()){
            BinaryTree temp=q.poll();
            System.out.print(temp.val);
            if(temp.left!=null)
                q.add(temp.left);
            if(temp.right!=null)
                q.add(temp.right);
        }
    }
}

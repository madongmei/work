/**
 * Created by madongmei on 2017/6/6.
 * 二叉树中和为某一值得路径
 */
import java.beans.BeanInfo;
import java.util.Stack;
public class $25_PathInTree {
    public static void main(String args[]){
        BinaryTree root=new BinaryTree(1);
        BinaryTree t1=new BinaryTree(2);
        BinaryTree t2=new BinaryTree(3);
        BinaryTree t3=new BinaryTree(4);
        BinaryTree t4=new BinaryTree(5);
        BinaryTree t5=new BinaryTree(4);
        BinaryTree t6=new BinaryTree(5);

        root.left=t1;
        root.right=t2;
        t1.left=t3;
        t1.right=t4;
        t2.left=t5;
        t2.right=t6;
        findPaths(root,8);
    }

    public static void findPaths(BinaryTree root,int sum){
        if(root==null)
            return;
        Stack<Integer> stack=new Stack<Integer>();
        int currentSum=0;
        findPaths(root,sum,stack,currentSum);
    }

    public static void findPaths(BinaryTree root,int sum,Stack<Integer> stack,int currentSum){
        currentSum+=root.val;
        stack.push(root.val);

        //如果是叶结点，则遍历它的子节点
        if(root.left==null && root.right==null){
            if(currentSum==sum)
                for(int ele:stack)
                    System.out.print(ele+"->");
            System.out.println();
        }

        //如果不是叶结点，则遍历它的子节点
        if(root.left!=null)
            findPaths(root.left,sum,stack,currentSum);
        if(root.right!=null)
            findPaths(root.right,sum,stack,currentSum);

        stack.pop();
    }
}

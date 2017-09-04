/**
 * Created by madongmei on 2017/6/5.
 * 二叉树镜像
 */
public class $19_MirrorOfBinaryTree {
    public static void main(String args[]){
        BinaryTree root=new BinaryTree(1);
        BinaryTree t1=new BinaryTree(2);
        BinaryTree t2=new BinaryTree(3);
        BinaryTree t3=new BinaryTree(4);
        BinaryTree t4=new BinaryTree(5);
        root.left=t1;
        root.right=t2;
        t1.left=t3;
        t1.right=t4;
        System.out.print("before:");
        print(root);
        System.out.println();
        System.out.print("after:");
        mirrorRecursively(root);
        print(root);
    }

    public static void mirrorRecursively(BinaryTree root){
        if(root==null)
            return;
        if(root.left==null && root.right==null)
            return;
        BinaryTree temp=root.left;
        root.left=root.right;
        root.right=temp;

        if(root.left!=null)
            mirrorRecursively(root.left);
        if(root.right!=null)
            mirrorRecursively(root.right);
    }

    public static void print(BinaryTree root){
        System.out.print(root.val+",");
        if(root.left!=null)
            print(root.left);
        if(root.right!=null)
            print(root.right);
    }
}

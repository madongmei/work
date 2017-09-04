/**
 * Created by madongmei on 2017/6/8.
 * 二叉树的深度
 */
public class $39_TreeDepth {
    public static void main(String args[]){
        BinaryTree root=new BinaryTree(1);
        BinaryTree t1=new BinaryTree(2);
        BinaryTree t2=new BinaryTree(3);
        BinaryTree t3=new BinaryTree(4);
        BinaryTree t4=new BinaryTree(5);

        root.left=t1;
        root.right=t2;
        t1.left=t3;
        t3.right=t4;
        System.out.print(getDepth(root));

    }

    public static int getDepth(BinaryTree root){
        if(root==null)
            return 0;

        int left=getDepth(root.left);
        int right=getDepth(root.right);

        return left>right?(left+1):(right+1);
    }
}

/**
 * Created by madongmei on 2017/6/5.
 * 树的子结构
 */
public class $18_SubStructureInTree {
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

        BinaryTree root1=new BinaryTree(2);
        BinaryTree c1=new BinaryTree(4);
        BinaryTree c2=new BinaryTree(5);
        root1.left=c1;
        root1.right=c2;
        System.out.print(hasSubTree(root,root1));
    }
    public static boolean hasSubTree(BinaryTree root1,BinaryTree root2){
        boolean result=false;
        if(root1!=null && root2!=null){
            if(root1.val==root2.val)
                result=doesTree1HasTree2(root1,root2);
            if(!result){
                result=doesTree1HasTree2(root1.left,root2);
            }
            if(!result){
                result=doesTree1HasTree2(root1.right,root2);
            }
        }
        return result;
    }

    public static boolean doesTree1HasTree2(BinaryTree root1,BinaryTree root2){
        if(root2==null)
            return true;
        if(root1==null)
            return false;
        if(root1.val!=root2.val)
            return false;
        return doesTree1HasTree2(root1.left,root2.left) && doesTree1HasTree2(root1.right,root2.right);
    }
}

class BinaryTree{
    int val;
    BinaryTree left;
    BinaryTree right;
    public BinaryTree(int val){
        this.val=val;
    }
    
    public BinaryTree(){
    	
    }
}


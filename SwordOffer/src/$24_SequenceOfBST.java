import java.util.Arrays;

/**
 * Created by madongmei on 2017/6/6.
 * 二叉搜索树的后序遍历序列
 * 输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历序列
 */
public class $24_SequenceOfBST {
    public static void main(String args[]){
        //int[] nums={3,8,7,10,12,11,9};
        //int[] nums={1};
        //int[] nums={1,2,3,4,5,6};
        int[] nums={3,7,5,8,6};
        System.out.print(sequenceOfBTS(nums));

    }

    public static boolean sequenceOfBTS(int[] sequence){
        if(sequence==null || sequence.length==0)
            return false;
        int len=sequence.length;
        int root=sequence[len-1];

        //在二叉搜素树中左子树的节点小于根节点
        int i=0;
        for(;i<len-1;i++){
            if(sequence[i]>root)
                break;//找到左右子树分界点
        }

        //右子树的节点大于根节点
        int cut=i;//第一个右半边的节点。
        for(int j=cut;j<len-1;j++) {
            if (sequence[j] < root) {
                return false;
            }
        }

        //判断左子树是不是二叉搜索树
        boolean left=true;
        if(cut>0)
            left=sequenceOfBTS(Arrays.copyOfRange(sequence,0,cut));
        //判断右子树是不是二叉搜索树
        boolean right=true;
        if(cut<len-1)
            right=sequenceOfBTS(Arrays.copyOfRange(sequence,cut,len-1));

        return left&&right;
    }
}

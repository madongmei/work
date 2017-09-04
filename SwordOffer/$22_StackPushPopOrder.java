/**
 * Created by madongmei on 2017/6/6.
 * 栈的压入弹出序列
 * 思想：如果下一个弹出的数字刚好是栈顶数字，那么直接弹出。、
 * 如果下一个弹出的数字不在栈顶，我们把压栈序列中没有入栈的数字压入辅助栈，直到把下一个需要弹出的数字压入栈顶为止。
 * 如果所有的数字都压入栈了，仍然没有找到下一个弹出的数字，那么该序列不可能是一个弹出序列。
 *
 */
import java.util.Stack;
public class $22_StackPushPopOrder {
    public static void main(String args[]){
        int[] s1={1,2,3,4,5};
        //int[] s2={4,5,3,1,2};
        int[] s2={4,5,3,2,1};
        System.out.print(isPopOrder(s1,s2));
    }

    public static boolean isPopOrder(int[] s1,int[] s2){
        if(s1==null || s2==null)
            return false;
        int point1=0;
        Stack<Integer> stack = new Stack<Integer>();
        for (int i=0;i<s2.length;i++){
            if(!stack.isEmpty() && stack.peek()==s2[i])
                stack.pop();
            else{
                if(point1==s1.length)
                    return false;
                else{
                    do {
                        stack.push(s1[point1++]);
                    }while(stack.peek()!=s2[i] && point1!=s1.length);
                    if(stack.peek()==s2[i])
                        stack.pop();
                    else
                        return false;
                }
            }
        }
        return true;
    }
}

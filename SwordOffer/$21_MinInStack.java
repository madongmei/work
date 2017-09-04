/**
 * Created by madongmei on 2017/6/6.
 * 包含min函数的栈
 */
import java.util.Stack;
public class $21_MinInStack{
    private static Stack<Integer> data_stack=new Stack<Integer>();
    private static Stack<Integer> min_stack=new Stack<Integer>();
    public static void main(String args[]){
        push(5);
        push(2);
        push(3);
        push(4);
        push(1);
        System.out.println(min());
        pop();
        System.out.println(min());
    }

    public static void push(Integer num){
        data_stack.push(num);
        if(min_stack.size()==0 || num<min_stack.peek())
            min_stack.push(num);
        else
            min_stack.push(min_stack.peek());
    }

    public static Integer pop(){
        min_stack.pop();
        return data_stack.pop();
    }

    public static Integer min(){
        return min_stack.peek();
    }
}

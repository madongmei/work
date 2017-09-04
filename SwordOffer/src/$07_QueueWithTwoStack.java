
import java.util.Stack;

import javax.management.RuntimeErrorException;


public class $07_QueueWithTwoStack<T> {
	
	Stack<T> s1=new Stack<T>();
	Stack<T> s2=new Stack<T>();
	
	public static void main(String[] args) {
		$07_QueueWithTwoStack<Integer> test=new $07_QueueWithTwoStack<Integer>();
		test.push(1);
		test.push(2);
		test.push(3);
		System.out.println("no1:"+test.pop());
		System.out.println("no2:"+test.pop());
		System.out.println("no3:"+test.pop());
	}
	
	public void push(T t){
		s1.push(t);
	}
	
	public T pop(){
		if(s2.isEmpty()){
			while(!s1.isEmpty()){
				s2.push(s1.pop());
			}
		}
		
		if(s2.isEmpty())
			throw new RuntimeException("队列为空");
		
		return s2.pop();
	}
}



/**
 * @author Demetria
 * description:
 * one frog can jump 1 step or 2 step,...,or n step, if it wants to jump to the n steps, how many ways it can get to the n step.
 */
public class $09_Fibonacci_frog2 {
	public static void main(String[] args) {
		//int n=0;
		//int n=1;
		//int n=2;
		//int n=3;
		int n=5;
		System.out.println(getFibonacci(n));
	}
	
	//non-recursive method, efficient, save time, time complexity is low.
	public static int getFibonacci(int n){
		int[] nums={1,2};
		if(n<=2)
			return nums[n-1];
		
		//return (int)Math.pow(2, n-1);//non-recursive
		return 2*getFibonacci(n-1); //recursive
	}
}





/**
 * @author Demetria
 * description:
 * one frog can jump 1 step or 2 step, if it wants to jump to the n steps, how many ways it can get to the n step.
 */
public class $09_Fibonacci_frog1 {
	public static void main(String[] args) {
		//int n=0;
		//int n=1;
		//int n=2;
		//int n=3;
		int n=6;
		System.out.println(getFibonacci(n));
	}
	
	//non-recursive method, efficient, save time, time complexity is low.
	public static int getFibonacci(int n){
		int[] nums={1,2};
		if(n<=2)
			return nums[n-1];
		
		int num1=1;
		int num2=2;
		int numn=0;
		for(int i=3;i<=n;i++){
			numn=num1+num2;
			
			num1=num2;
			num2=numn;
		}
		return numn;
	}
}



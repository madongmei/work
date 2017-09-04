

public class $09_Fibonacci {
	public static void main(String[] args) {
		//int n=0;
		//int n=1;
		//int n=2;
		//int n=3;
		int n=4;
		System.out.println(getFibonacci(n));
	}
	
	//non-recursive method, efficient, save time, time complexity is low.
	public static int getFibonacci(int n){
		int[] nums={0,1};
		if(n<=1)
			return nums[n];
		
		int num1=1;
		int num2=0;
		int numn=0;
		for(int i=2;i<=n;i++){
			numn=num1+num2;
			
			num2=num1;
			num1=numn;
		}
		return numn;
	}
	
	//another way to solve the problem
	public static int getFabonacci_1(int n){
		if(n<=0)
			return 0;
		if(n==1)
			return 1;
		return getFabonacci_1(n-1)+getFabonacci_1(n-2);
	}  
}



public class $10_NumberOf1InBinary {
	public static void main(String[] args) {
		//int n=5;
		//int n=0;
		//int n=0x7FFFFFFF;
		int n=0x80000000;
		//int n=0xFFFFFFFF;
		System.out.println(Integer.toBinaryString(n));
		System.out.println(getNum(n));
		System.out.println(getNum1(n));
	}
	
	
	//use the package method to solve
	public static int getNum(int n){
		int num=Integer.bitCount(n);
		return num;
	}
	
	
	//use the bit operation to solve 
	public static int getNum1(int n){
		int count=0;
		while(n!=0){
			++count;
			n=(n-1)&n;
		}
		return count;
	}
}

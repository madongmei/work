package com.other.test;
//import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        //Scanner in = new Scanner(System.in);
        //int n=in.nextInt();
    	int n=(int)Math.pow(10, 18);
    	System.out.println(n);
        int flag=0;
        for(int j=2;j<Math.sqrt(n) && isPrime(j);j++){
            for(int k=2;k<Math.sqrt(n) && isPrime(k);k++){
                int sum=(int)Math.pow(j,k);
                if(sum==n){
                    System.out.print(j+" "+k);
                    flag=1;
                    break;
                }else if(sum>n){
                    break;
                }
            }
            if(flag==1)
            	break;
        }
        if(flag!=1)
        	System.out.print("No");
        
    }
    
    public static boolean isPrime(int m){
        for(int i=2;i<Math.sqrt(m);i++){
            if(m%i==0)
                return false;
        }
        
        return true;
    }
}
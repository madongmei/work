/**
 * Created by madongmei on 2017/6/8.
 * 求第n个丑数，丑数是指只包含2,3,5因子的数。
 */
public class $34_UglyNumber {
    public static void main(String args[]){
        int n=1500;
        System.out.print(getUglyNumber(n));
    }
    public static int getUglyNumber(int n){
        if(n<=0)
            return -1;
        int[] ugly=new int[n];
        int base1=1;
        int base2=1;
        int base3=1;
        ugly[0]=1;
        for(int i=1;i<n;i++){
            int min=min(base1*2,base2*3,base3*5);
            ugly[i]=min;
            while(base1*2<=min)
                base1++;
            while(base2*2<=min)
                base2++;
            while(base3*2<=min)
                base3++;
        }
        return ugly[n-1];
    }

    public static int min(int i,int j,int k){
        int min=i>j?j:i;
        return min<k?min:k;
    }
}

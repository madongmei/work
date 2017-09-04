/**
 * Created by madongmei on 2017/6/8.
 */
public class $32_NumberOf1 {
    public  static void main(String args[]){
        //long num=0;
        //long num=1;
        long num=10000;
        System.out.println(getNumOf1(num));

    }

    public static long getNumOf1(long n){
        long count=0;
        long i=1;
        long current=0;
        long after=0;
        long before=0;

        while((n/i)!=0){
            current=(n/i)%10;//当前数字
            before=n/(i*10);//高位数字
            after=n-(n/i)*i;//低位数字
            if(current>1)
                count=count+(before+1)*i;
            else if(current==0)
                count=count+before*i;
            else if(current==1)
                count=count+before*i+after+1;
            i=i*10;
        }
        return count;
    }
}

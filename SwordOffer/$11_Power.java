/**
 * Created by madongmei on 2017/6/5.
 */
public class $11_Power {
    public static void main(String args[]){
        System.out.println(solution(2,-2));
    }

    public static double solution(double base,int exponent){
        if(equal(base,0.0) && exponent<0)
            throw new RuntimeException("无意义");
        if(exponent==0)
            return 1;
        if(exponent==1)
            return base;
        if(exponent<0)
            return 1.0/getRes(base,-exponent);
        else
            return getRes(base,exponent);
    }

    public static double getRes(double base,int exponent){
        double result=1;
        for(int i=0;i<exponent;i++){
            result=result*base;
        }
        return result;
    }

    public static boolean equal(double d1,double d2){
        if((d1-d2)>-0.0000001 && (d1-d2)<0.0000001){
            return true;
        }else
            return false;
    }
}

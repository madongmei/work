/**
 * Created by madongmei on 2017/6/5.
 */
public class $12_Print1ToMaxOfNDigits {
    public static void main(String args[]){
        fun1(5);
    }

    public static void fun1(int n){
        if(n<0)
            return;
        StringBuffer s=new StringBuffer(n);
        for(int i=0;i<n;i++){
            s.append("0");
        }

        for(int i=0;i<10;i++){
            s.setCharAt(0,(char)(i+'0'));
            fun2(s,n,0);
        }
    }

    public static void fun2(StringBuffer s,int n,int index){
        if(index==n-1){
            printNum(s);
            return;
        }
        for(int i=0;i<10;i++){
            s.setCharAt(index+1,(char)(i+'0'));
            fun2(s,n,index+1);
        }
    }

    public static void printNum(StringBuffer s){
        boolean isBeginning0=true;
        for(int i=0;i<s.length();i++){
            if(isBeginning0 && s.charAt(i)!='0'){
                isBeginning0=false;
            }
            if(!isBeginning0){
                System.out.print(s.charAt(i));
            }
        }
        System.out.println();
    }
}

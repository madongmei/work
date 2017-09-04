/**
 * Created by madongmei on 2017/6/8.
 * 第一个只出现一次的字符
 */
public class $36_FirstNotRepeatingChar {
    public static void main(String args[]){
        //String str="abcdefghij";
        String str=null;
        System.out.println(getFirstChar(str));
    }

    public static Character getFirstChar(String str){
        if(str==null)
            return null;
        char[] chs=str.toCharArray();
        int[] arr=new int[255];
        for(int i=0;i<chs.length;i++){
            arr[chs[i]]++;
        }

        for(int i=0;i<chs.length;i++){
            if(arr[chs[i]]==1)
                return (char)chs[i];
        }
        return null;
    }
}

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by madongmei on 2017/6/8.
 * 把数组排成最小数
 */
public class $33_SortArrayForMinNumber {
    public static void main(String args[]) {
        //int[] arr={4,5,6,45,7};
        //int[] arr={6};
        int[] arr={55,66,54};
        System.out.println(getMaxNum(arr));
    }

    public static String getMaxNum(int[] arr){
        StringBuffer des=new StringBuffer();
        String[] strs=new String[arr.length];
        for(int i=0;i<arr.length;i++){
            strs[i]=arr[i]+"";
        }
        Arrays.sort(strs,new Comparator<String>(){
            @Override
            public int compare(String s1, String s2) {
                String str1=s1+s2;
                String str2=s2+s1;
                return -str1.compareTo(str2);
            }
        });

        for(int i=0;i<strs.length;i++)
            des.append(strs[i]);
        return des.toString();
    }
}

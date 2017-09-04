/**
 * Created by madongmei on 2017/5/27.
 * use "%20" to replace all Blank in one String
 */
public class $4_ReplaceBlank {
    public static void main(String args[]){
        String str="Hello  world";
        System.out.println("str:"+ replace_blank(str));
    }

    public static String replace_blank(String str){
        String temp="";
        for(int i=0;i<str.length();i++) {
            if (str.charAt(i) == ' ') {
                temp += "20%";
            } else
                temp += str.charAt(i);
        }
        return temp;
    }
}

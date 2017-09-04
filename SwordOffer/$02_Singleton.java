/**
 * Created by madongmei on 2017/5/27.
 * $2_Singleton example
 * ensure the thread is safe.
 */
public class $2_Singleton {
    private static $2_Singleton single=null;
    private $2_Singleton(){}
    public static $2_Singleton getInstance(){
        if(single==null){
            synchronized ($2_Singleton.class){
                if(single==null){
                    single=new $2_Singleton();
                }
            }
        }
        return single;
    }
}

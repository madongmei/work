import java.util.HashMap;
import java.util.Map;

/**
 * Created by madongmei on 2017/6/8.
 * 数组中出现次数超过一半的数字
 */
public class $29_MoreThanHalfNumber {

    public static void main(String args[]){
        int[] nums={1,2,2,2,2,2,4,4,1,1,1,1,1,1,1};
        findNumber(nums);
    }

    public static void findNumber(int[] nums){
        HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
        int len=nums.length;
        for(int i=0;i<nums.length;i++){
            if(!hm.containsKey(nums[i])){
                hm.put(nums[i],1);
            }else
                hm.put(nums[i],hm.get(nums[i])+1);
        }
        for(Map.Entry<Integer,Integer> e:hm.entrySet()){
            if(e.getValue()>=len/2)
                System.out.println(e.getKey()+"..."+e.getValue());
        }
    }
}

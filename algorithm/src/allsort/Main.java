package allsort;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Main {



	/* 请完成下面这个函数，实现题目要求的功能 */
	/* 当然，你也可以不按照下面这个模板来作答，完全按照自己的想法来 ^-^ */
	/****************************** 开始写代码 ******************************/
	static String[] demo(int M, int N, List<String> listlog) {

		Main demo = new Main();

		List<String> nameList = demo.findNoisyBoy(M, N, listlog);

		return nameList.toArray(new String[0]);

	}
        
        public static List findNoisyBoy(int M,int N, List<String> listlog){
               List<String> nameList=new ArrayList<String>();
               String[] strs=(String[])nameList.toArray();
               SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//日期字符串格式
               
               try {
	               for(int i=0;i<strs.length-1;i++){
	            	   String[] key=strs[i].split("#");
	            	   String date1=key[0];
					   Date d1=sdf.parse(date1);//按照格式解析字符串，返回Date对象
	            	   String name1=key[1];
	            	   String cont1=key[2];
	            	   int count=1;
	            	   for(int j=1;j<strs.length;j++){
	            		   String[] temp=strs[j].split("#");
	                	   String date2=temp[0];
	                	   Date d2=sdf.parse(date2);
	                	   String name2=temp[1];
	                	   String cont2=temp[2];
	                	   long seconds=(d1.getTime()-d2.getTime())/1000;//得出两个时间的毫秒差，再除以1000得到相差秒数
	                       long minutes=seconds/60;//将秒数换算成分钟数
	                       if(name1.equals(name2)){
	                    	   if(minutes<=M){
	                    		   count++;
	                    		   if(count>N){
	                    			   nameList.add(name1);
	                    		   }else{
	                    			   continue;
	                    		   }
	                    	   }else{
	                    		   continue;
	                    	   }
	                       }
	            	   }
	               }
               } catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			return nameList;
        }

	/****************************** 结束写代码 ******************************/

	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String[] res;

        int _nMin;
        _nMin = Integer.parseInt(in.nextLine().trim());
        
        int _nNum;
        _nNum = Integer.parseInt(in.nextLine().trim());

		List<String> _listLog = new ArrayList<String>();
	

		String _result="";
		while (_result != null) {
			try {
				_result = in.nextLine();
				_listLog.add(_result);
			} catch (Exception e) {
				_result = null;
			}
		}

		res = demo(_nMin, _nNum, _listLog);
		for (int res_i = 0; res_i < res.length; res_i++) {
			System.out.println(String.valueOf(res[res_i]));
		}

	

    }
}
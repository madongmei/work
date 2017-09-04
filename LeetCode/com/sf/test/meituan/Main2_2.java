package com.sf.test.meituan;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main2_2 {
	public static void main(String args[]){
    	Scanner in = new Scanner(System.in);
    	int n=in.nextInt();
    	int[]  nums=new int[n];
    	for(int i=0;i<n;i++){
    		nums[i]=in.nextInt()/100;
    	}
    	int total=(int)Math.ceil(n*0.6);//�������Ե���Ŀ����
    	double sum=0;
    	 for(int i=total;i<=n;i++){
    		 List<int[]> list=combine(nums,i); 
    		 for(int k=0;k<list.size();k++){
    			 int[] res=list.get(k);
    			 double p=1;
    			 for(int j=0;j<res.length;j++){
    				 if(res[j]==1)
    					 p=p*nums[j];
    			 }
    			 sum=sum+p;
    		 }
    		 System.out.println(sum);
    	 }
	} 
	     
	     
	    public static List combine(int[] a,int m){   
	        int n = a.length;   
	        List<int[]> result = new ArrayList<int[]>();   
	           
	        int[] bs = new int[n];   
	        for(int i=0;i<n;i++){   
	            bs[i]=0;   
	        }   
	        //��ʼ��   
	        for(int i=0;i<m;i++){   
	            bs[i]=1;   
	        }   
	        boolean flag = true;   
	        boolean tempFlag = false;   
	        int pos = 0;   
	        int sum = 0;   
	        //�����ҵ���һ��10��ϣ�Ȼ����01��ͬʱ��������е�1�ƶ�������������   
	        do{   
	            sum = 0;   
	            pos = 0;   
	            tempFlag = true;    
	            result.add(bs);   
	               
	            for(int i=0;i<n-1;i++){   
	                if(bs[i]==1 && bs[i+1]==0 ){   
	                    bs[i]=0;   
	                    bs[i+1]=1;   
	                    pos = i;   
	                    break;   
	                }   
	            }   
	               
	            for(int i=0;i<pos;i++){   
	                if(bs[i]==1){   
	                    sum++;   
	                }   
	            }   
	            for(int i=0;i<pos;i++){   
	                if(i<sum){   
	                    bs[i]=1;   
	                }else{   
	                    bs[i]=0;   
	                }   
	            }   
	               
	            for(int i= n-m;i<n;i++){   
	                if(bs[i]==0){   
	                    tempFlag = false;   
	                    break;   
	                }   
	            }   
	            if(tempFlag==false){   
	                flag = true;   
	            }else{   
	                flag = false;   
	            }   
	               
	        }while(flag);   
	        result.add(bs);   
	           
	        return result;   
	    }   
	       
	}   

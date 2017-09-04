package com.leetcode.string;

/**
 * @author Demetria
 * 这个题目有点不好理解。【难】
 */
public class CountandSay_38 {

	public static void main(String args[]){
		int n=3;
		System.out.println(countAndSay(n));
	}
	
	public static String countAndSay(int n) {
        StringBuilder seq = new StringBuilder("1");
        for(int i=1;i<n;i++){
            seq = getNextSeq(seq);
        }
        return seq.toString();
    }
    
    public static StringBuilder getNextSeq(StringBuilder s){
        int count = 1;
        int sLen = s.length();
        StringBuilder res = new StringBuilder("");
        for(int i=1;i<sLen;i++){
            if(s.charAt(i)==s.charAt(i-1)){
                count++;
            } else {
                res.append(count);
                res.append(s.charAt(i-1));
                count = 1;
            }
        }
        res.append(count);
        res.append(s.charAt(sLen-1));
        return res;
    }
}

package com.leetcode.string;

/**
 * @author Demetria
 * "fffbfg"
 * "effjfggbffjdgbjjhhdegh"
 *
 * "bjaajgea"
 * "affhiiicabhbdchbidghccijjbfjfhjeddgggbajhidhjchiedhdibgeaecffbbbefiabjdhggihccec"
 */
public class RansomNote_383 {

	public static void main(String args[]){
		System.out.println(canConstruct("a", "b"));//false
		System.out.println(canConstruct("aa", "ab"));//false
		System.out.println(canConstruct("aa", "aab"));// true
		System.out.println(canConstruct("bjaajgea", "affhiiicabhbdchbidghccijjbfjfhjeddgggbajhidhjchiedhdibgeaecffbbbefiabjdhggihccec"));//true
	}
	
	public static boolean canConstruct(String ransomNote, String magazine) {
		int index;
		for(int i=0;i<ransomNote.length();i++){
			char ch=ransomNote.charAt(i);
			if((index=magazine.indexOf(ch))!=-1){
				magazine=magazine.substring(0, index)+magazine.substring(index+1, magazine.length());
				continue;
			}
			else{
				return false;
			}
		}
		return true;
	}
}

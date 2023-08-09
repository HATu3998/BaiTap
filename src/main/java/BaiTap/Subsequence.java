package BaiTap;

public class Subsequence {
//	Given two strings s and t, return true if s is a subsequence of t, or false otherwise.
//
//			A subsequence of a string is a new string that is formed from the original
//			string by deleting some (can be none) of the characters without disturbing
//			the relative positions of the remaining characters. (i.e., "ace" is a subsequence
//					of "abcde" while "aec" is not).
	   public boolean isSubsequence(String s, String t) {
	        if(s.length()>t.length()){return false;}
	        if(s.length()==0){return true;}
	        int sub=0;
	        for(int i=0;i<t.length();i++){
	            if(s.charAt(sub)==t.charAt(i)){
	                sub++;
	            }
	        }
	        return sub==s.length();
	    }
}

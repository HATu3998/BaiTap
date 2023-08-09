package BaiTap;

public class FindIndexString {
//	Given two strings needle and haystack, return the index of the first occurrence 
//			of needle in haystack, or -1 if needle is not part of haystack.
	
	 public int strStr(String haystack, String needle) {
	        int n=needle.length();
	        int h=haystack.length();
	        int count=0;
	     
	        for(int i=0;i<h-n+1;i++){
	int j;

	        for( j=0;j<n;j++){
	            if(haystack.charAt(i+j)!=needle.charAt(j)){
	                break;
	            }
	          
	        }
	          if(n==j){
	                return i;
	            }
	            
	        }
	        return -1;
	    }
}

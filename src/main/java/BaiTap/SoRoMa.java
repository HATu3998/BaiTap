package BaiTap;

public class SoRoMa {
	  public int romanToInt(String s) {
	         int sum=0;
	        for(int i=0;i<s.length();i++){
	           
	            if((i+1)<s.length() && getval(s.charAt(i))<getval(s.charAt(i+1))){
	                sum=sum-getval(s.charAt(i));
	            }else{
	                sum=sum+getval(s.charAt(i));
	            }
	        }
	        return sum;
	    
	}
	    public int getval(char C){
	        switch(C){
	            case 'I':
	            return 1;
	            case 'V':
	            return 5;
	            case 'X':
	            return 10;
	            case 'L':
	            return 50;
	            case 'C':
	            return 100;
	            case 'D':
	            return 500;
	            case 'M':
	            return 1000;
	        }
	        return 0;
	    }
}

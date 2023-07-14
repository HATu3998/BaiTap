package BaiTap;
import java.util.*;
import java.util.regex.*;
public class XacDinhMatKhau {

	public static void main (String[] args){
	    Scanner input=new Scanner(System.in);
	    String s=input.next();
	    boolean t=isStrongPassword(s);
	    if(t){
	      System.out.print("TRUE");
	    }else{
	       System.out.print("FALSE");
	    }
	   
	  }
	   public static boolean isStrongPassword(String password) {
	     if (password.length() < 8) {
	            return false;
	        }
	        
	      
	        if (!Pattern.compile(".*[a-z].*").matcher(password).matches()) {
	            return false;
	        }
	        
	  
	        if (!Pattern.compile(".*[A-Z].*").matcher(password).matches()) {
	            return false;
	        }
	        
	     
	        if (!Pattern.compile(".*\\d.*").matcher(password).matches()) {
	            return false;
	        }
	        
	     
	        if (!Pattern.compile(".*[@#$%^&+=].*").matcher(password).matches()) {
	            return false;
	        }
	        
	       
	        return true;}
	  
	}
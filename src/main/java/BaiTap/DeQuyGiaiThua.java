package BaiTap;
import java.util.Scanner;
public class DeQuyGiaiThua {

	  public static void main(String[] args){
		    Scanner input=new Scanner(System.in);int n=input.nextInt();
		    
		      if (n <= 20) {
		            long factorial = calculateFactorial(n);
		            System.out.println(n + "! = " + factorial);
		        } else {
		            System.out.println("n phai nho hon hoac bang 20.");
		        }
		  }
	  public static long calculateFactorialD(int n) {
	        if (n == 0 || n == 1) {
	            return 1;
	        } else {
	            return n * calculateFactorial(n - 1);
	        }
	    }
		  
		    public static long calculateFactorial(int n) {
		        long result = 1;
		        for (int i = 1; i <= n; i++) {
		            result *= i;
		        }
		        return result;
		    }
}

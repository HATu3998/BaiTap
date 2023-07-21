package BaiTap;
import java.util.*;
public class DeQuyFibo {
	  public static void main(String[] args){
		    Scanner input=new Scanner(System.in);
		    int n=input.nextInt();
		    int rs=fibo(n);
		    System.out.print(rs);
		  }
		  
		  public static Integer fibo(int n){
		    if( n==1){
		      return 1;
		    }else if(n==0){return 0;}else{
		    return fibo(n-2)+fibo(n-1);
		  } }
}

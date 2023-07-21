package BaiTap;
import java.util.*;
public class CapSoCong {

//	Trong toán học, một cấp số cộng là một dãy số thoả mãn điều kiện: hai phần tử liên tiếp 
//	nhau sai khác nhau một hằng số. Tức là, hiệu của hai phần tử bất kỳ liên tiếp nhau là bằng nhau.
//	Chẳng hạn, dãy số 3, 5, 7, 9, 11,... là một cấp số cộng với các phân tử liên tiếp sai khác nhau 
//	hằng số 2.
//
//	Hằng số sai khác chung được gọi là công sai của cấp số cộng. Các phần tử của nó cũng 
//	được gọi là các số hạng.
//
//	Hãy viết chương trình nhận đầu vào là một dãy số nguyên nhập vào từ bàn phím và 
//	thực hiện kiểm tra xem dãy số đã nhập vào có phải dạng cấp số cộng hay không.
	
	  public static void main(String[] args){
		    
		    Scanner input=new Scanner(System.in);
		    int n=input.nextInt();
		    int[] a=new int[n];
		    for(int i=0;i<n;i++){
		      a[i]=input.nextInt();
		      
		    }
		    boolean t=false;
		    for(int i=0;i<n;i++){
		      int diff=a[i+1]-a[i];
		      for(int j=i+2;j<n;j++){
		        if(a[j]-a[j-1]!=diff){
		          t=true;break;
		        }
		        
		      }
		      if(!t){break;}
		    }
		    if(t){
		      System.out.print("NO");
		    }else{
		      System.out.print("YES");
		    }
		    
		  }
		  
		}
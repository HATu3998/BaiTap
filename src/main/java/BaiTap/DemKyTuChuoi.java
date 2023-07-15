package BaiTap;
import java.util.*;
public class DemKyTuChuoi {

	
//	Đếm tần suất ký tự trong chuỗi
//	Đến với bài này, ta sẽ bắt đầu làm quen vào sâu hơn với cách để thao tác với 
//	từng ký tự trong chuỗi.
//
//	Yêu cầu
//
//	Đầu vào là một chuỗi kí tự có độ dài không quá 10.000 ký tự. Hãy đếm số lần xuất
//	hiện của từng ký tự một có trong chuỗi. Và in theo thứ tự xuất hiện trong chuỗi từ trái qua phải.
//
//
//	Warning
//
//	Chỉ liệt kê 1 lần 1 ký tự, tránh liệt kê trùng lặp
//	Ví dụ 1
//
//	Đầu vào:
//
//	hocthuattoancungtek4
//	Đầu ra:
//
//	h2 o2 c2 t4 u2 a2 n2 g1 e1 k1 41
	
	
	
	 public static void main(String[] args){
		 System.out.println("nhập chuỗi:");
		    Scanner input=new Scanner(System.in);
		    String s=input.next();
		    Map<Character, Integer> fre=new HashMap<>();

		    for(int i=0;i<s.length();i++){
		      char c=s.charAt(i);
		      fre.put(c,fre.getOrDefault(c,0)+1);
		    }
		    
		    
		    for (int i = 0; i < s.length(); i++) {
		            char c = s.charAt(i);
		            if (fre.containsKey(c)) {
		                System.out.print(c + "" + fre.get(c)+" ");
		                fre.remove(c); 
		            }
		        }
		  }
}

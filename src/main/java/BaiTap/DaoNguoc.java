package BaiTap;

import java.util.Scanner;

public class DaoNguoc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input=new Scanner(System.in);
String s=input.next();
input.close();
String reverser=reverserString(s);
System.out.print(reverser);
	}
public static String reverserString(String s) {
	StringBuilder revered=new StringBuilder();
	for(int i=s.length()-1;i>=0;i--) {
		revered.append(s.charAt(i));
	}
	return revered.toString();
}
}

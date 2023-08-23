package BaiTap;

import java.time.LocalDate;
import java.text.DecimalFormat;
public class PercentageCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int base=100;
		
		LocalDate currentDate=LocalDate.now();
		//int year=currentDate.getYear();
		int year=2024;
		double rs=base;
		for(int i=year;i<year+10;i++) {
			if(yearEven(i)) {
				rs+=Percentage(20,rs);
				System.out.println(i+"year"+"= "+(int)rs);
			
			}else { 
				rs+=Percentage(10,rs);
				System.out.println(i+"year"+"= "+(int)rs);
			}
		}
	}
	public static boolean yearEven(int y) {
		return y%2==0;
	}
	public static double Percentage(double amount, double percentage) {
        return (percentage / 100) * amount;
    }

}

package BaiTap;

public class IntegertoRoman {
	  public String intToRoman(int num) {
	         String[] romanSymbols = {
	            "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"
	        };
	        int[] values = {
	            1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1
	        };

	        StringBuilder rs=new StringBuilder();
	        int i=0;
	        while(num>0){
	if(num>=values[i]){
	    rs.append(romanSymbols[i]);
	    num-=values[i];
	}else{
	    i++;
	}

	        }
	        return rs.toString();
	    }
}

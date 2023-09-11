package BaiTap;

public class DaoChuoi {

	public String rever(String s) {
		char[] charArray=s.toCharArray();
		String serveser="";
		for(int i=charArray.length-1;i>=0;i--) {
			serveser+=charArray[i];
		}
		return serveser;
	}
}

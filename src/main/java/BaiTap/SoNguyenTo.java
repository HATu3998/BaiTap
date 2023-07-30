package BaiTap;

public class SoNguyenTo {
public static void main(String[] args) {
	int n=2;
	if(isPrime(n)) {
		System.out.print(n);
	}else {
		System.out.print("không phải số nguyên tố");
	}
}
public static boolean isPrime(int num) {
	if(num<=1) {return false;}
	for(int i=2;i<=Math.sqrt(num);i++) {
		if(num%i==0) {
			return false;
		}
	}
	return true;
}
}

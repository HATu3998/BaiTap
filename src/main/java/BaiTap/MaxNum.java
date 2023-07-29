package BaiTap;



public class MaxNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

int[] a= {3,6,7,8,9};
int num=0;
for(int i=0;i<a.length;i++) {
	if(num<a[i]) {
		num=a[i];
	}
}
System.out.print(num);
	}

}

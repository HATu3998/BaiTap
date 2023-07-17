package BaiTap;

import java.util.ArrayList;
import java.util.List;

public class NoiHaiMang {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1= {2,3,4};
		int [] arr2= {5,6,7};
List a=new ArrayList();
a=combine(arr1,arr2);
for(int i=0;i<a.size();i++) {
	System.out.print(a.get(i)+" ");
}
	}
	public static List combine(int[] arr1, int[] arr2) {
	    List ans = new ArrayList<>();
	    int i = 0;
	    int j = 0;

	    while (i < arr1.length && j < arr2.length) {
	        if (arr1[i] < arr2[j]) {
	            ans.add(arr1[i]);
	            i++;
	        } else {
	            ans.add(arr2[j]);
	            j++;
	        }
	    }

	    while (i < arr1.length) {
	        ans.add(arr1[i]);
	        i++;
	    }

	    while (j < arr2.length) {
	        ans.add(arr2[j]);
	        j++;
	    }

	    return ans;
	}
}

package BaiTap;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
public static void main(String[] args) {
//	int[] arr= {1,2,3,4,1,2,1};
//	Map<Integer,Integer> myMap=new HashMap<>();
	
	String[] arr= {"anh","tu","huynh","anh","anh","tu"};
	Map<String,Integer> myMap=new HashMap<>();
	//for(int n:arr) {
	for(String n:arr) {
		if(myMap.containsKey(n)==false) {
			//n chua xuat hien trong map
			myMap.put(n, 1);
		}else {
			//n da xuat hien truoc do
			int soLanXuatHien=myMap.get(n);
			soLanXuatHien++;
			myMap.put(n, soLanXuatHien);
		}
	}
	
	for(Map.Entry entry:myMap.entrySet()) {
		System.out.println(entry.getKey() +" xuat hien "+entry.getValue()+" lan");
	}
}
}

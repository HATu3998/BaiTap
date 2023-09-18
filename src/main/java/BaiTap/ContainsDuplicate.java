package BaiTap;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ContainsDuplicate {
	 public boolean containsDuplicate(int[] nums) {
	     Set<Integer> mySet=new HashSet<>();
		for(int n:nums) {
			if(mySet.contains(n)) {
				return true;
			}else {
				mySet.add(n);
			}
		}
		return false;
			}
}

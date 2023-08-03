package BaiTap;

public class XoaPhanTuGiongNhau {
	public int removeDuplicates(int[] nums) {
	       int k=1;
	       for(int i=1;i<nums.length;i++){
	           if(nums[i]!=nums[i-1]){
	               nums[k]=nums[i];
	               k++;
	           }
	       }
	       return k;
	    }
	
	//phần tử xuất hiện nhiều hơn 2
    public int removeDuplicatesNum2(int[] nums) {
        int k=2;
         for(int i=2;i<nums.length;i++){
             if(nums[k-2]!=nums[i]){
                 nums[k]=nums[i];
                 k++;
             }
         }
         return k;
    }
}

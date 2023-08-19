package BaiTap;

public class ReverseString {
    public String reverseWords(String s) {
        String[] sword=s.split(" ");

        StringBuilder re=new StringBuilder();
       
       for(int i=sword.length-1;i>=0;i--){
           if(!sword[i].isEmpty()){
               re.append(sword[i]).append(" ");
         
           }
       }
       return re.toString().trim();
    }
}

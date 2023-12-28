package Practice;
import java.util.*;
public class str1 {
    public static void main(String[] args) {
        String s="love mason";
        String ans=reverse(s);
        System.out.println(ans);
    }
    public static String reverse(String str){
      String ans="";
      for(int i=str.length()-1;i>=0;i--){
        char ch=str.charAt(i);
        ans+=ch;

      }
      return ans;
    }
    
}

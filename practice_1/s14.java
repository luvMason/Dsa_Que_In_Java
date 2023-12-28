package practice_1;
import java.util.*;
public class s14 {
    public static void main(String[] args) {
        String str = "abbbad";
        checkPalinSubstring(str);
        

    }
    public static void checkPalinSubstring(String str){
        
        ArrayList<String> al=new ArrayList<>();

        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<=str.length();j++){

                String sub=str.substring(i, j);
                boolean ans=checkPalindrome(sub);

                if(ans==true&&al.contains(sub)==false){
                    al.add(sub);
                }
            }
        }
        System.out.println(al);
        
    }

    public static boolean checkPalindrome(String str){
        int s=0;
        int e=str.length()-1;

        while(s<e){
            char start=str.charAt(s);
            char end=str.charAt(e);

            if(start!=end){
                return false;
            }
            s++;
            e--;
        }
        return true;
    }
}

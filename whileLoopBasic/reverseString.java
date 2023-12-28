package whileLoopBasic;
import java.util.*;
public class reverseString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int l=str.length();
        String ans="";
        int i=l-1;
        while(i>=0){
            char ch=str.charAt(i);
           ans=ans+ch;
             i--;
        }
        System.out.println(ans);

    }
    
}

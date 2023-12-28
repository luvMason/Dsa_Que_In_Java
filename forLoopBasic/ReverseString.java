package forLoopBasic;
import java.util.*;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int l=str.length();
        String ans="";
        for(int i=l-1;i>=0;i--){
            char ch=str.charAt(i);
           ans=ans+ch;

        }
        System.out.println(ans);

    }
    
}

package Practice;
import java.util.*;
public class p1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char ch=sc.next().charAt(0);
        if(ch>='a'){
            if(ch<='z'){
               System.out.println("Lowercase");
            }
        }else if(ch>='A'){
            if(ch<='Z'){
                System.out.println("Upercase");
            }
        }else{
            System.out.println("Invalid");
        }
    }
    
}

package whileLoopBasic;
import java.util.*;
public class even {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=0;
        while(i<=n){
            if(i%2==0){
                System.out.println(i);
                
            }
            i++;
        }
    }
    
}

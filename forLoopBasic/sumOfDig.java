package forLoopBasic;
import java.util.*;
public class sumOfDig {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        
        // for(;n>0;){
        //     int digit=n%10;
            
        //     sum=sum+digit;
        //     n=n/10; 
            
        // }System.out.println(sum);
        while(n>0){
            int digit=n%10;
            
            sum=sum+digit;
            n=n/10; 
            
        }
        System.out.println(sum);
    }
    
}

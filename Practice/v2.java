package Practice;
import java.util.*;
public class v2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         int og=n;
         int sum=0;
         for(;n>0;){
            int d=n%10;
            sum+=d*d*d;
            n=n/10;
         }
         if(og==sum){
            System.out.println("Armstrong");
         }else{
            System.out.println("No");
         }
    }
    
}

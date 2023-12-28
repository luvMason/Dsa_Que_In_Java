package whileLoopBasic;
import java.util.*;
public class findPrimeToN {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=2;
        
        while(i<=n){
            int count=0;
            int j=2;
            while(j<i){
                
                if(i%j==0){
                    count++;
                }
                j++;
            }
            if(count==0){
                System.out.println(i);
            }
            i++;
        }
        
    }
}

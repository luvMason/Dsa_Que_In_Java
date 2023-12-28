package forLoopBasic;
import java.util.*;
public class armstrong {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int sum=0;
            int og=n;
            for(;n>0;){
                int digit=n%10;
               
                sum=sum+digit*digit*digit;
                n=n/10; 
                
            }if(sum==og){
                System.out.println("Armstrong No.");
            }else{
                System.out.println(" Not Armstrong No.");
            }
        }
        
    }
    

    


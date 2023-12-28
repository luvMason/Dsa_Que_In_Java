package forLoopBasic;

import java.util.*;
public class prime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to check ");
        int n=sc.nextInt();
        
        int count=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                count++;
            }
        }
         if(count==2){
            System.out.println("Prime");
        }else{
            System.out.println("Not prime");
        }
        // boolean flag=true;
        // for (int i=2;i<n;i++){
        //     if(n%i==0){
        //         flag=false;
        //     }

        // }if(flag==true){
        //     System.out.println("Prime");
        // }
        // else{
        //     System.out.println("Not Prime");
        // }

    }
    
}

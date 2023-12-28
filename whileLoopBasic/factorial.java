package whileLoopBasic;
import java.util.*;
public class factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // int n=5;
        // int i=1;
        // int ans=1;
        // while(i<=n){
        //   ans=ans*i;
        //   i++;
        // }
        // System.out.println(ans);

        int n=sc.nextInt();
        int ans=1;
        while(n>0){
            ans=ans*n;
            n--;
        }
        System.out.println(ans);
    }
    
}

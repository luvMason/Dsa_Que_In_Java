package AllQuestion.loop;
import java.util.*;

public class p {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the no.");
        int n=sc.nextInt(); 
        System.out.println("Enter the power of no.");
        int p=sc.nextInt();
         int ans=1;


        while(p!=0){
            ans*=n;
            p--;
        }


        System.out.println(ans);
    }
}

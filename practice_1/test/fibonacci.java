package practice_1.test;
import java.util.*;
public class fibonacci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in) ; 

        int n=sc.nextInt();
        int n1=0, n2=1, n3=-1;

        for(int i=1;i<=n;i++){
          n3=n1+n2;
          System.out.println(n1);
          n1=n2;
          n2=n3;
        }
      }
    
}

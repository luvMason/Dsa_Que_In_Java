import java.util.*;
public class minAge3 {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);

       System.out.println("Enter name of Ajay,Ram,Syham:");

      int ajay=sc.nextInt();
      int ram=sc.nextInt();
      int shyam=sc.nextInt();

        // int p1 = 8, p2 = 34, p3 = 21;

        // if (p1 < p2) {
        //     if (p1 < p3) {
        //         System.out.println("p1");

        //     } else {
        //         System.out.println("p3");
        //     }
        // }else if (p2 < p3) {
        //     System.out.println("p2");
        // }else {
        //     System.out.println("p3");
        // }

        if(ajay<ram && ajay<shyam){
            System.out.println("Ajay");
        }else if (ram<ajay && ram<shyam){
            System.out.println("Ram");
        }else{
            System.out.println("Shyam");
        }
    }
}

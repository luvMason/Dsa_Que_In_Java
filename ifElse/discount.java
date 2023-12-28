import java.util.*;
public class discount {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int p=sc.nextInt();
        int q=sc.nextInt();
         
        if(q<=100){
            int cp=p*q;
            System.out.println("Quantity is not greater than 100");
            System.out.println(cp);
        }else{
            int cp=p*q;
             cp=(cp*90)/100;   
          System.out.println("Quantity is  greater than 100");
          System.out.println(cp);
       }
    }
}

package practice_1.test;

import java.util.Scanner;

public class discount10Per {
    public static void main(String[] args) {
                Scanner sc=new Scanner(System.in);
        System.out.println("Enter Price");
        int p=sc.nextInt();
        System.out.println("Enter Quantity");
        int q=sc.nextInt();
         
        if(q<=100){
            int cp=p*q;
            System.out.println(cp);
        }else{
            int cp=p*q;
            int dis=(cp*10)/100; 
            cp-=dis; 
            System.out.print("10% discount applied  ");
          System.out.println(cp);
       }

    }
}

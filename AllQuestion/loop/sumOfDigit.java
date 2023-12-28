package AllQuestion.loop;

import java.util.Scanner;

public class sumOfDigit {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the digit");
        int n=sc.nextInt();
        int sum=0;

        for(;n>0;){
      
            int d=n%10;
            sum+=d;
            n=n/10;


        }
        System.out.println(sum);
    }
}

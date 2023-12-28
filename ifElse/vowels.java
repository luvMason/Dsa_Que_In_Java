import java.util.*;

public class vowels {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter any character");
    char ch = sc.next().charAt(0);

    // if(ch=='a') {
    // System.out.println("vowel");

    // } else if(ch=='e'){
    // System.out.println("vowel");
    // }else if(ch=='i'){
    // System.out.println("vowel");
    // }else if(ch=='o'){
    // System.out.println("vowel");
    // }else if(ch=='u'){
    // System.out.println("vowel");
    // } else if(ch=='A'){
    // System.out.println("vowel");
    // }else if(ch=='E'){
    // System.out.println("vowel");
    // }else if(ch=='I'){
    // System.out.println("vowel");
    // }else if(ch=='O'){
    // System.out.println("vowel");
    // }else if(ch=='U'){
    // System.out.println("vowel");
    // }else{
    // System.out.println("consonant");

    // }


                          //With the help of Relational Operator:
                          
    if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
        ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
      System.out.println("Vowel");
    } else {
      System.out.println("Consonant");
    }
  }

}

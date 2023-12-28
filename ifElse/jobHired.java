
import java.util.*;

public class jobHired {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Press M for Married and U for Unmarried:");
        char status = sc.next().charAt(0);

        System.out.println("Enter your age");

        int age = sc.nextInt();

        System.out.println("Press M for Male and F for Female");

        char gender = sc.next().charAt(0);

        // if (status == 'm' || status == 'M') {
        // System.out.println("You are Hired");

        // } else if (age > 30 && (gender == 'm' || gender == 'M')) {
        // System.out.println("You are Hired");
        // } else if (age > 25 && (gender == 'f' || gender == 'F')) {
        // System.out.println("You are Hired");
        // } else {
        // System.out.println("You are not Hired");

        // }
        if ((status == 'm' || status == 'M') || (age > 30 && (gender == 'm' || gender == 'M'))
                || (age > 25 && (gender == 'f' || gender == 'F')))

        {
            System.out.println("You are Hired");
        } else {
            System.out.println("You are not Hired");
        }
    }
}
import java.util.*;

public class isTriOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter all angles of triangle:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int sum = a + b + c;

        if (sum == 180) {
            System.out.println("Valid Triangle:");
        } else {
            System.out.println("Invalid Triangle:");
        }
    }
}

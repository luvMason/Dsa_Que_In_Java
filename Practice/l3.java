package Practice;

import java.util.Scanner;

public class l3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter year ");
        int y = sc.nextInt();
        System.out.println(" Enter month ");
        int m = sc.nextInt();
        if (m != 2 && m <= 12) {
            if (m % 2 != 0) {
                System.out.println("31 days");
            } else {
                System.out.println("30 days");
            }
        } else if (m == 2 && y % 4 == 0) {
            System.out.println("29 days");
        } else if (m == 2) {
            System.out.println("28 days");
        } else {
            System.out.println("Invalid month Number");
        }
    }

}

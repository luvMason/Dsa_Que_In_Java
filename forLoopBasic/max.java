package forLoopBasic;

import java.util.*;

public class max {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = 0;
        System.out.println("enter no.of student");
        int n = sc.nextInt();
        System.out.println("enter marks of student");
          
        for (int i = 1; i <= n; i++) {
            int j = sc.nextInt();
            if (max < j) {
                max = j;
            }

        }
        System.out.println(max);

    }

}

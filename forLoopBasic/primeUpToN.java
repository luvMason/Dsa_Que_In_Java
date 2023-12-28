package forLoopBasic;

import java.util.*;

public class primeUpToN {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();

        // for (int i = 2; i <= n; i++) {
        // int count = 0;
        // for (int j = 2; j < i; j++) {
        // if (i % j == 0) {
        // count++;
        // }
        // }
        // if (count == 0) {
        // System.out.println(i);
        // }
        // }
        int n = 1;
        int m = 20;
        
        for (int k = n; k <= m; k++) {
            boolean flag = true;
            for (int i = 2; i < k; i++) {
                if (k % i == 0) {
                    flag = false;

                }
                
                }
                if (flag == true) {
                    System.out.println(k);
            }
        }

    }
}

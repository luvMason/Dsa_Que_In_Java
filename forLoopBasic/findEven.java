package forLoopBasic;

import java.util.*;

public class findEven {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for (int i = 0; i <= n; i++)
            if (i % 2 == 0) {
                {

                    System.out.println(i);
                }
            }
        // for (int i = 0; i <= n; i = i + 2) {

        // System.out.println(i);
        // }
    }
}

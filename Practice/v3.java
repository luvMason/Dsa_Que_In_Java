package Practice;

public class v3 {
    public static void main(String[] args) {
        int n = 7;
        int m = 33;

        
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

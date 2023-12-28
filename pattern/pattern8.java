package pattern;

public class pattern8 {
    public static void main(String[] args) {
        int n = 5;
        int nst = 1;
        for (int i = 1; i <= (2 * n - 1); i++) {

            for (int j = 1; j <= nst; j++) {
                System.out.print("*\t");

            }
            if (i < n) {
                nst++;

            } else {
                nst--;
            }

            System.out.println("");
        }
    }

}

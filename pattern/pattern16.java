package pattern;

public class pattern16 {
    public static void main(String[] args) {
        
    
    int n = 7;
        for (int i = 1; i <= n; i++ ) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || j==(n+1)/2) {

                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    
}
}

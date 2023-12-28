package pattern;

public class pattern19 {
    public static void main(String[] args) {
        
    
    
        int n = 5;
            for (int i = 1; i <= n; i++ ) {
                for (int j = 1; j <= n; j++) {
                    if (i == 1 || (j==1 && i<=(n+2)/2)|| i==(n+2)/2 ||i==n ||(j==n && i>=(n+2)/2 )) {
    
                        System.out.print("*\t");
                    } else {
                        System.out.print("\t");
                    }
                }
                System.out.println();
            }
    
        }
    
}

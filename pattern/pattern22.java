package pattern;

public class pattern22 {
    public static void main(String[] args) {
        
    
    
        int n = 7;
            for (int i = 1; i <= n; i++ ) {
                for (int j = 1; j <= n; j++) {
                    if (i == 1||(n+1==i+j)||i==n ){
    
                        System.out.print("*\t");
                    } else {
                        System.out.print("\t");
                    }
                }
                System.out.println();
            }
    
        }
    
}

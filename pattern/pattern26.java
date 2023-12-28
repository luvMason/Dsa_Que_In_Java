package pattern;

public class pattern26 {
    public static void main(String[] args) {
        
    
        int n = 7;
                for (int i = 1; i <= n; i++ ) {
                    for (int j = 1; j <= n; j++) {
                        if ((i== j && j>=(n+1)/2) ||(i==2 &&  j<=n-1) ){
        
                            System.out.print("*\t");
                        } else {
                            System.out.print("\t");
                        }
                    }
                    System.out.println();
                }
        
            }
    
}

package pattern;

public class pattern24 {
    public static void main(String[] args) {
        
    
        int n = 5;
                for (int i = 1; i <= n; i++ ) {
                    for (int j = 1; j <= n; j++) {
                        if ((j==(n+2)/2 && i>=(n+2)/2)
                        ||((n+1==i+j) && j>=(n+2)/2) 
                        ||(i==j && j<=(n+2)/2)){
        
                            System.out.print("*\t");
                        } else {
                            System.out.print("\t");
                        }
                    }
                    System.out.println();
                }
        
            }
    
}

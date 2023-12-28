package practice_1.test;

public class printY {
    public static void main(String[] args) {

        int n=5;
      
                for (int i = 1; i <= n; i++ ) {
                    for (int j = 1; j <= n; j++) {
                        if ((j==(n+1)/2 && i>=(n+1)/2)
                        ||((n+1==i+j) && j>=(n+1)/2) 
                        ||(i==j && j<=(n+1)/2)){
        
                            System.out.print("*\t");
                        } else {
                            System.out.print("\t");
                        }
                    }
                    System.out.println();
                }

    }
    
}

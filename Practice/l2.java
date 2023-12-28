package Practice;

public class l2 {
    public static void main(String[] args) {
        int n=5;
        int nsp=n-1;
        int nst=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=nsp;j++){
                System.out.print("\t");
            }
            for(int j=1;j<=nst;j++){
                System.out.print("*\t");
            }
            if(i<n){
                nst++;
                nsp--;
            }
            System.out.println();
        }
    }
    
}

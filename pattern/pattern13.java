package pattern;

public class pattern13 {
    public static void main(String[] args) {
        int n = 7;
        int nsp=n/2;
        int nst=1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= nsp ; j++) {
                System.out.print("\t");

            }

            for (int j = 1; j <= nst; j++) {

                System.out.print("*\t");

            }
            if(i<(n+1)/2){
                nsp--;
                nst+=2;
            }else{
                nsp++;
                nst=nst-2;
            }

            System.out.println("");
        }
    }
    
}

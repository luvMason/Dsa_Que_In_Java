package AllQuestion;

public class pattern3 {
    public static void main(String[] args) {
        int n=5;
        int nst=1;
        int nsp=2;

        for(int i=1;i<=n;i++){
            for(int s=1;s<=nsp;s++){
                System.out.print(" ");
            }
            for(int t=1;t<=nst;t++){
                System.out.print("*");
            }

            if(i<(n/2)+1){
                nst+=2;
                nsp--;
            }else{
                nst-=2;
                nsp++;
            }
            System.out.println();
        }
    }
    
}

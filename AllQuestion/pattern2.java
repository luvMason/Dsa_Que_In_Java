package AllQuestion;

public class pattern2 {
    public static void main(String[] args) {
        int n=5;
        int nst=1;
        int nsp=n-1;

        for(int i=1;i<=(n*2)-1;i++){
            for(int s=1;s<=nsp;s++){
                System.out.print(" ");
            }
            for(int t=1;t<=nst;t++){
                  System.out.print("*");
            }

            if(i<n){
                nst++;
                nsp--;
            }else{
                nst--;
                nsp++;
            }
            System.out.println();
        }
    }
    
}

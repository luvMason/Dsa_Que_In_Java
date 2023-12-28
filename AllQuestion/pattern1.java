package AllQuestion;

public class pattern1 {
    public static void main(String[] args) {
        int n=5;
        int nst=1;
        for(int i=1;i<=(n*2)-1;i++){
            for(int j=1;j<=nst;j++){
                System.out.print("*");
            }
            if(i<n){
                nst++;
            }else{
                nst--;
            }
            System.out.println();
        }
    }
    
}

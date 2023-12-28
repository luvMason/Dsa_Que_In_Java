package AllQuestion;

import ArrayList.oddEleCount;

public class pattern4 {
    public static void main(String[] args) {

        int n=5;
        for(int i=1;i<=n;i++){
            for (int j = 1; j <= n; j++) {
            if(j==(n+1)/2 ||i==(n+1)/2||j==1&&i<=(n+1)/2||j==n&&i>=(n+1)/2||i==1&&j>=(n+1)/2||i==n&&j<=(n+1)/2){
                System.out.print("\t* ");
            }
            else{
                System.out.print("\t ");
            }
        }
        System.out.println();
    }
    
}
}

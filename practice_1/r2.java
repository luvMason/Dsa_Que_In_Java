package practice_1;

public class r2 {
    public static void main(String[] args) {
        int n=10;
       int ans=fac(n);
        System.out.println(ans);
    }
    public static int fac(int n){
        if(n==0||n==1){
            return 1;
        }
        int pf=1;
        pf=pf*fac(n-1);
        int fac=n*pf;
         return fac;
    }
    
}

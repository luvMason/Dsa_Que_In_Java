package practice_1;

public class facInRecursion {
    public static void main(String[] args) {
        int n=10;
        int ans=fac(n);
        System.out.println(ans);
    }
    public static int fac(int n){
        if(n==0||n==1){
            return 1;
        }else{
            int pre=fac(n-1);
            int ans=n*pre;
            return ans;
        }
    }
    
}

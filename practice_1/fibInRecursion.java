package practice_1;

public class fibInRecursion {
    public static void main(String[] args) {
        int n=5;
        int ans=fac(n);
        System.out.println(ans);
    }
    public static int fac(int n){
        if(n==1){
            return 0;
        }else if(n==2){
            return 1;
        }else{

        
        int fpre=fac(n-1);
        int spre=fac(n-2);
        int ans=fpre+spre;
        return ans;
        }
    }
}

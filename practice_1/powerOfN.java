package practice_1;

public class powerOfN {
    public static void main(String[] args) {
        int n=2;
        int m=10;
        int ans=power(n,m);
        System.out.println(ans);

    }
    public static int power(int n,int m){
        if(n==1||m==0){
            return 1;
        }else if(m==1){
            return n;

        }
        int pre=power(n,m-1);
        int ans=n*pre;
        return ans;
    }
    
}

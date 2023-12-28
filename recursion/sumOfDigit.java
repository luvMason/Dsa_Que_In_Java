package recursion;

public class sumOfDigit {
    public static void main(String[] args) {
        
        int n=1235;
        int ans=sum(n);
        System.out.println(ans);
    }
    public static int sum(int n){
        if(n>=0&&n<=9){
            return n;

        }
        int d=n%10;
        int rem=n/10;
        int preSum=sum(rem);
        int ans=d+preSum;
           return ans;
    }
    
}

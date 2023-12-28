package practice_1;

public class sumOfdigit {
    public static void main(String[] args) {
        int n=495849;
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
        return d+preSum;
    }
    
}

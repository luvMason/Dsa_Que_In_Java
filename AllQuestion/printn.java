package AllQuestion;

public class printn {
    public static void main(String[] args) {
        int n=5789;
        int ans=print(n);
        System.out.println(ans);
    }

    public static int print(int n){
       if(n>=0&&n<=9){
        return n;
       }
        
       int d=n%10;
       int rem=n/10;
       int preSum=print(rem);
       int ans=d+preSum;
         return ans;

    }

}


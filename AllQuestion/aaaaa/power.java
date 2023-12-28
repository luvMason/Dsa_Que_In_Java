package AllQuestion.aaaaa;

import whileLoopBasic.sumOfNat;

public class power {
    public static void main(String[] args) {
        int n = 2;
        int x = 5;

        int ans = power(n, x);

        System.out.println(ans);
    }

    public static int power(int n,int x){
        if(x==1){
            return n;
        }else if(x==0||n==1){
            return 1;
        }

        int pre=power(n,x-1);
        int ans=pre*n;

        return ans;
    }

}

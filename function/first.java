package function;

public class first {
    public static void main(String[] args) {
        // int n=10;
        // print(n);
        // int ans=factorial(5);
        // System.out.println(ans);
        int ans=armstrong(153);
        System.out.println(ans);

    }
    public static void print(int n){
        for(int i=0;i<=n;i++){
            System.out.println(i);
        }
    }
    public static int factorial(int n){
       if(n==0){
        return -1;
       }
       int sum=1;
       for(int i=1;i<=n;i++){
        sum*=i;

       }
       return sum;

    }
    public static int armstrong(int n){
        int og=n;
        int sum=0;
        while(n>0){
            int d=n%10;
            sum=sum+(d*d*d);
            n=n/10;
        }
        if(sum==og){

            return 1;
        }else{
            return 0;
        }
    }

    
}

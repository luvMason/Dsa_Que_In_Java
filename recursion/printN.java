package recursion;

public class printN {
    public static void main(String[] args) {
        int n=10;
        print(n);

    }
    public static void print(int n){
        if(n<=0){
            return ;
        }
        System.out.println(n);
        print(n-1);
    }
      public static void print1(int m){
        if(m<=0){
            return ;
        }
        print(m-1);
        System.out.println(m);
    }
    
}

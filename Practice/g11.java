package Practice;

public class g11 {
    public static void main(String[] args) {
        int n=8509385;
        int sum=0;
         while(n>0){
            int d=n%10;
            if(d%2==0){
                sum+=d;
            }
            n=n/10;
         }
         System.out.println(sum);
    }
    
}

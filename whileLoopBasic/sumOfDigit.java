package whileLoopBasic;

public class sumOfDigit {
    public static void main(String[] args) {
        int n=9678452;
        int sum=0;
        // int i=1;
        while(n>0){
            int digit=n%10;
            
            sum=sum+digit;
            n=n/10; 
            
        }System.out.println(sum);
    }
    
}

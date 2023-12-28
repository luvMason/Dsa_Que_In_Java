package whileLoopBasic;

public class arm {
    public static void main(String[] args) {
        int n=159;
        int sum=0;
        int og=n;
        while(n>0){
            int digit=n%10;
           
            sum=sum+digit*digit*digit;
            n=n/10; 
            
        }if(sum==og){
            System.out.println("Armstrong No.");
        }else{
            System.out.println(" Not Armstrong No.");
        }
    }
    
}

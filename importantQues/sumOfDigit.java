package importantQues;

public class sumOfDigit {
    public static void main(String[] args) {
        int n=7873;

        int sum=0;
        while(n>0){
            int d=n%10;
            sum+=d;
            n=n/10;

        }
        System.out.println(sum);

    }
    
}

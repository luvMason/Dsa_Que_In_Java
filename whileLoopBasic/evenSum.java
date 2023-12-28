package whileLoopBasic;

public class evenSum {
    
    public static void main(String[] args) {
        int sum = 0;
        int n = 100;
        int i = 1;
        while ( i <= n) {
            if (i % 2 == 0) {
                sum = sum + i;
            }
            i++;
        }
        System.out.println(sum);
    }
    
}

    


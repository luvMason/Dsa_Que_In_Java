package whileLoopBasic;

public class power {
    public static void main(String[] args) {
        int n=2;
        int m=5;
        int p=1;
        int i=1;
        while(i<=m){
            p=p*n;
            i++;
        }
        System.out.println(p);
    }
    
}

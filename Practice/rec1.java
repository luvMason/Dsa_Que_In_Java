package Practice;

public class rec1 {
    public static void main(String[] args) {
        int n=10;
        print(n);
    }
    public static void print(int m){
        if(m<=0){
            return;
        }
        System.out.println(m);
        print(m-1);
    }
}

package Practice;

public class v1 {
    public static void main(String[] args) {
        int n=10;
        int n1=0;
        int n2=1;
        int n3=-1;
        for(int i=1;i<=10;i++){
            n3=n1+n2;
            System.out.println(n1);
            n1=n2;
            n2=n3;

        }
    }
    
}

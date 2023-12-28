package whileLoopBasic;

public class fibonaaci {
    public static void main(String[] args) {
        
    
    int n=8;
    int n1=0,n2=1,n3=0;
    // int i=1;
    // while(i<=n){
    //     n3=n1+n2;
    //     System.out.println(n1);
    //     n1=n2;
    //     n2=n3;
    //     i++;
    while(n>0){
        n3=n1+n2;
        System.out.println(n1);
        n1=n2;
        n2=n3;
        n--;
    }
}
    
}

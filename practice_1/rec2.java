package practice_1;

public class rec2 {
    public static void main(String[] args) {
      int n=3;
        toh(n,'s','d','h');
    }
    public static void toh(int n,char s,char d,char h ){
    
    if(n==1){
        System.out.println(n+"["+s+"->"+d+"]");
        return;
    }
    toh(n-1,s,h,d);
     System.out.println(n+"["+s+"->"+d+"]");
     toh(n-1,h,d,s);
}
}
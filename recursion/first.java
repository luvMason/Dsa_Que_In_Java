package recursion;

public class first {
    public static void main(String[] args) {
        System.out.println("main started");
        firstFun();
        System.out.println("main end");
    }
    public static void firstFun(){
        System.out.println("firstFun start");
        secondFun();
        System.out.println("firstFun end");
    }
    public static void secondFun(){
        System.out.println("secondFun called");

    }
    
}


public class maxNo {
    public static void main(String[] args) {
      


        int a = 5, b = 8, c = 1017;
        

        // if(a >= b) {
        //     if(a > c){ 
        //         System.out.println( "a is the largest number");
        //     } 
        //      else
        //         System.out.println("c is the largest number");
        // }  
        // else if(b > c)
        //         System.out.println("b is the largest number");
        //     else
        //         System.out.println("c is the largest number");

                             //With the help of Relational Operator:
                             
         if(a>b && a>c){
            System.out.println("a");
         }else if(b>a && b>c){
            System.out.println("b");
         }else{
            System.out.println("c");
         }
        
}
}
package Practice;
import java.util.*;
public class u2 {
    public static void main(String[] args) {
        int arr[][]={{33,45},
                     {44,78}};
       int max=0;
       for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr[0].length;j++){
            max=Math.max(max, arr[i][j]);
        }
       }    
       System.out.println(max);          
    }
    
}

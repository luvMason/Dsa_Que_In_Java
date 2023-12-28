package Array;
import java.util.*;
public class removeElement {
    public static void main(String[] args) {
        int[] arr={23,56,4,5};
        int[] res=new int[arr.length-1];
        
        int k=4;
       int itr=0;
        for(int i=0;i<arr.length;i++){
          if(k!=arr[i]){
            res[itr]=arr[i];
            itr++;
          }
           
        }
          System.out.println(Arrays.toString(res));
    }
    
}

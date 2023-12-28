package Practice;
import java.util.*;
public class p20 {
    public static void main(String[] args) {
        int [] arr={2,3,4,4,4,5};
       int k=4;
       int count=0;
       for(int i=0;i<arr.length;i++){
        if(k==arr[i]){
            count++;
        }
       }
       int [] arr1=new int[arr.length-count];
        int itr=0;
       for(int i=0;i<arr.length;i++){

       
        if(k!=arr[i]){
               arr1[itr]=arr[i];
               itr++;
            }
        }
        System.out.println(Arrays.toString(arr1));
      

    }
    
}

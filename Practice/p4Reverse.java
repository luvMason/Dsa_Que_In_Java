package Practice;
import java.util.*;
public class p4Reverse {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int l=arr.length;
        int s=0;
        int e=l-1;
        int t=-1;
        for(;s<e;){
            {
              t=arr[s];
              arr[s]=arr[e];
              arr[e]=t;
              s++;
              e--;
             }
        }
        System.out.println(Arrays.toString(arr));
    }
    
}

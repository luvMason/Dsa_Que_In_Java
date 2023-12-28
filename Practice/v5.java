package Practice;
import java.util.*;
public class v5 {
    public static void main(String[] args) {
        
        int arr[]={1,2,3,4,3,3};
        int k=3;
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(k==arr[i]){
                count++;
            }
        }
        int res[]=new int[arr.length-count];
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

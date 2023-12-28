package Practice;
import java.util.*;
public class p10Remove {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5};
        int k=4;
        int [] ans=new int[arr.length-1];
         int itr=0;
        for(int i=0;i<arr.length;i++){
            
            if(k!=arr[i]){
               ans[itr]=arr[i];
               itr++;
            }
        }
        System.out.println(Arrays.toString(ans));

    }
    
}

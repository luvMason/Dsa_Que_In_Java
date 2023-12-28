package ArrayList;
import java.util.*;
public class maximumDiffInArrList {
    
    public static void main(String[] args) {
        int[] arr={4,6,8,9,1};
         int max=Integer.MIN_VALUE;
         int min=Integer.MAX_VALUE;
        ArrayList<Integer> al=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            al.add(arr[i]);
        }
       
        for(int i=0;i<al.size();i++){
            if(max<al.get(i)){
                max=al.get(i);
            }
             if(min>al.get(i)){
                min=al.get(i);
            }
            
        }
        int diff=max-min;
        System.out.println(diff);
        
        
        
    }
    
}

    


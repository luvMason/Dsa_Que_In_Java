package practice_1;

import java.util.Arrays;

public class a3 {
    public static void main(String[] args) {
        int []arr={1,2,3,4,56};
        int k=56;
        
        int []res=new int[arr.length-1];
        
        
         int itr=0;
       
         for(int i=0;i<arr.length;i++){
         
            if(arr[i]!=k){
            res[itr]=arr[i];
            itr++;
          }
        }

        System.out.println(Arrays.toString(res));
    }
    
}

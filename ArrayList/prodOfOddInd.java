package ArrayList;

import java.util.ArrayList;

public class prodOfOddInd {
    
    public static void main(String[] args) {
       
       int arr[]={1,2,3,4,5,};
        ArrayList<Integer> al=new ArrayList<>();
        int max=0;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
           al.add(arr[i]);
            
           
        }
        
        
        for(int j=0;j<al.size();j++){
           if(max<al.get(j)){
            max=al.get(j);
           }
            if(min>al.get(j)){
            min=al.get(j);
           }
        }
        System.out.println(max-min);
      
    }
    
}


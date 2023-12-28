package ArrayList;

import java.util.ArrayList;

public class findSpecificInd {
    public static void main(String[] args) {
       
       int arr[]={1,2,3,4,5,};
        ArrayList<Integer> al=new ArrayList<>();
        
        for(int i=0;i<arr.length;i++){
           al.add(arr[i]);
            
           
        }
       int k=4;
        for(int j=0;j<al.size();j++){
            if(k==al.get(j)){
                 
                System.out.println(j);
            }
        }
      
    }
    
}

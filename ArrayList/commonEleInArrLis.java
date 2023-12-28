package ArrayList;

import java.util.ArrayList;

public class commonEleInArrLis {
    public static void main(String[] args) {
       
       int arr[]={1,2,3,4,5,};
        int arr1[]={1,22,3,4};

        ArrayList<Integer> al=new ArrayList<>();
        ArrayList<Integer> al1=new ArrayList<>();
        
        for(int i=0;i<arr.length;i++){
           al.add(arr[i]);
            
           
        }
        for(int i=0;i<arr1.length;i++){
           al1.add(arr1[i]);
            
           
        }
    
        for(int i=0;i<al.size();i++){
            for(int j=0;j<al1.size();j++){
               if(al.get(i)==al1.get(j)){
                System.out.println(al.get(i));
                
               }
            }
        }
       
      
    }
    
}

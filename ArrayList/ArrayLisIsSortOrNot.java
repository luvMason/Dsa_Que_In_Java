package ArrayList;

import java.util.ArrayList;

public class ArrayLisIsSortOrNot {
    public static void main(String[] args) {
       
       int arr[]={1,2,3,84,5,};
        ArrayList<Integer> al=new ArrayList<>();
        
        for(int i=0;i<arr.length;i++){
           al.add(arr[i]);
            
           
        }
       boolean flag=true;
        for(int j=0;j<al.size()-1;j++){
            int k=j;

            if(al.get(j)<=al.get(k+1)){
                 
                
            }else{
                flag=false;
            }
        }
        if(flag==true){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
      
    }
    
}

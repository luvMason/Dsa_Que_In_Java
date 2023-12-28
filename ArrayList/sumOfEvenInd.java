package ArrayList;

import java.util.ArrayList;

public class sumOfEvenInd {
    public static void main(String[] args) {
       
       int arr[]={1,2,3,4,5,};
        ArrayList<Integer> al=new ArrayList<>();
        
        for(int i=0;i<arr.length;i++){
           al.add(arr[i]);
            
           
        }
        int sum=0;
        for(int j=0;j<al.size();j++){
            if(j%2==0){
                sum+=al.get(j);
            }
        }
        System.out.println(sum);
      
    }
    
}

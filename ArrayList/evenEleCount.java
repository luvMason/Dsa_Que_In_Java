package ArrayList;
import java.util.*;
public class evenEleCount {
    public static void main(String[] args) {
       int arr[]={1,2,3,4,5,};
        ArrayList<Integer> al=new ArrayList<>();
        
        for(int i=0;i<arr.length;i++){
           al.add(arr[i]);
            
           
        }
        int count=0;
        for(int j=0;j<al.size();j++){
            if(al.get(j)%2==0){
                 count++;
            }
        }
        System.out.println(count);
      
    }
    
}

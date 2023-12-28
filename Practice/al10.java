package Practice;
import java.util.*;
public class al10 {
    public static void main(String[] args) {
        int arr[]={1,1,2,1,3,3,2,4,5};
        ArrayList<Integer>al=new ArrayList<>();
       
        
        for(int i=0;i<arr.length;i++){
            int ele=arr[i];

            boolean flag=al.contains(ele);

            if(flag==false){
                al.add(ele);
            }
        }
        System.out.println(al);


    }
    
}

package practice_1;
import java.util.*;
public class a8 {
    public static void main(String[] args) {
        
        int[]arr={2,3,2,3,5,6,32,1,343,5,53,32,433,3,434,3};
        ArrayList<Integer> al = new ArrayList<>();
      
        for(int i=0;i<arr.length;i++){
            int ele=arr[i];


           boolean flag = false;


            for(int j=0;j<al.size();j++){
                int listEle=al.get(j);


                if(listEle==ele){
                    flag =true;
                    break;
                }
            }
            if(flag ==false){
                al.add(ele);
            }
        }
        System.out.println(al);
    }
    
}

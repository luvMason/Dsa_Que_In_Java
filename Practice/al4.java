package Practice;
import java.util.*;
public class al4 {
    public static void main(String[] args) {
        ArrayList<Integer>al=new ArrayList<>();
        int arr[]={1,2,33,4,5};
        for(int i=0;i<arr.length;i++){
            al.add(arr[i]);

        }
          boolean flag =true;
        for(int i=0;i<al.size()-1;i++){
            if(al.get(i)>al.get(i+1)){
                flag =false;
            }
        }
        System.out.println(flag);

    }
    
}

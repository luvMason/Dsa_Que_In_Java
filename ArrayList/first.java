package ArrayList;
import java.util.*;
public class first {
    public static void main(String[] args) {
        ArrayList<Integer> al=new ArrayList<>();
//add element
       al.add(1);
       al.add(2);
       al.add(3);
       al.add(4);
 //remove element
 al.add(2,5);
 al.remove(2);
 

      for(int i=0;i<al.size();i++){
       int ele= al.get(i);
        System.out.println(ele);
      }
    }
    
}

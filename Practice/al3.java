package Practice;
import java.util.*;
public class al3 {
    public static void main(String[] args) {
        ArrayList<Integer>al=new ArrayList<>();
          al.add(1);
          al.add(2);
          al.add(3);
          al.add(4);
           int k=2;
          for(int i=0;i<al.size();i++){
            if(k==al.get(i)){
                System.out.println(i);
                break;
            }
          }
    }
    
}

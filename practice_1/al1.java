package practice_1;
import java.util.*;
public class al1 {
    public static void main(String[] args) {
        ArrayList<Integer> al=new ArrayList<>();
         ArrayList<Integer> al1=new ArrayList<>();

         al.add(1);
         al1.add(1);
          al.add(2);
         al1.add(2);
          al.add(3);
         al1.add(3);
          al.add(4);
         al1.add(5);

         for(int i=0;i<al.size();i++){
            for(int j=0;j<al1.size();j++){
                if(al.get(i)==al1.get(j)){
                    System.out.print(al.get(i)+ "  ");
                }
            }
         }
    }
    
}

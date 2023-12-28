package Practice;
import java.util.*;
public class al6 {
    public static void main(String[] args) {
        ArrayList<Integer>al=new ArrayList<>();
        al.add(22);
        al.add(33);
        al.add(44);
        al.add(67);
        al.add(99);


        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<al.size();i++){
            max=Math.max(max, al.get(i));
             min=Math.min(min, al.get(i));
        }

        System.out.println(max-min);
    }
    
}

package Practice;
import java.util.*;
public class al1 {
    public static void main(String[] args) {
        ArrayList<Integer>al=new ArrayList<>();
        al.add(2);
        al.add(12);
        al.add(4);
        al.add(5);
        al.add(6);
         int sum=0;
         int count=0;
        for(int i=0;i<al.size();i++){
            if(al.get(i)%2==0){
            //    sum+=al.get(i);
            count++;
            }
        }
        System.out.println(count);

    }
    
}

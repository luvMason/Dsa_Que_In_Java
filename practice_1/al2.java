package practice_1;
import java.util.*;
public class al2 {
    public static void main(String[] args) {
        
        ArrayList <Integer> al=new ArrayList<>();
        ArrayList <Integer> al1=new ArrayList<>();
         ArrayList <Integer> res=new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(7);
        al.add(10);
        al.add(15);
         al1.add(1);
        al1.add(2);
        al1.add(7);
        al1.add(10);
        al1.add(15);

        int p1=0;
        int p2=0;


        while(p1!=al.size()&&p2!=al1.size()){
            if(al.get(p1)>al1.get(p2)){
               res.add(al1.get(p2));
               p2++;
            }else{
                 res.add(al.get(p1));
               p1++;
            }
        }
        if(p1==al.size()){
            for(int i=p2;i<al1.size();i++){
                res.add(al1.get(p2));
            }
        }else{
            for(int i=p1;i<al.size();i++){
                res.add(al.get(p1));
            }
        }

        System.out.println(res);

    }
}
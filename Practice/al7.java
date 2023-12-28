package Practice;
import java.util.*;
public class al7 {
    public static void main(String[] args) {
        ArrayList<Integer>al=new ArrayList<>();
        ArrayList<Integer>al1=new ArrayList<>();
        ArrayList<Integer>res=new ArrayList<>();


        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        al1.add(1);
        al1.add(2);
        al1.add(3);
        al1.add(4);

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
            res.add(al1.get(i));
        }
       }else{
         for(int i=p1;i<al1.size();i++){
            res.add(al.get(i));
        }
       }

       System.out.println(res);


    }
    
}

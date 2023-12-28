package Practice;

import java.util.ArrayList;

public class al8 {
   public static void main(String[] args) {
        ArrayList<Integer>al=new ArrayList<>();
        ArrayList<Integer>al1=new ArrayList<>();
        ArrayList<Integer>res=new ArrayList<>();


        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        al1.add(1);
        al1.add(22);
        al1.add(3);
        al1.add(4);
          for(int i=0;i<al.size();i++){
            for(int j=0;j<al1.size();j++){
                if(al.get(i)==al1.get(j)){
                    System.out.println(al.get(i));
                }
            }
          }
        
    }
    
}

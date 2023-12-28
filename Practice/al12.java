package Practice;
import java.util.*;
public class al12 {
    public static void main(String[] args) {
        ArrayList<Integer>al=new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(0);
        al.add(3);
        al.add(8);
        al.add(9);
        al.add(5);
        int max=Integer.MIN_VALUE;
        for(int i=0;i<al.size();i++){
            max=Math.max(max, al.get(i));
        }

        for(int h=max;h>=0;h--){
            for(int i=0;i<al.size();i++){

                if(h<=al.get(i)){
                    System.out.print("*\t");
                }else{
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
        
    }
    
}

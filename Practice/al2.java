package Practice;
import java.util.*;
public class al2 {
    public static void main(String[] args) {
        ArrayList<Integer>al=new ArrayList<>();
        int []arr={1,1,3,4,5};
        for(int i=0;i<arr.length;i++){
            al.add(arr[i]);
        }
        int count =0;
        for(int i=0;i<al.size();i++){
            if(al.get(i)%2!=0){
               count++;
            }
        }
        System.out.println(count);
    }
    
}

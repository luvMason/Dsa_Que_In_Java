package importantQues;
import java.util.*;
public class removeDuplicate {

    public static void main(String[] args) {
        int arr[]={1,1,2,3,4,3};
        ArrayList<Integer>al=new ArrayList<>();

        for(int i=0;i<arr.length;i++){
            int ele=arr[i];


            boolean ans=al.contains(ele);

            if(ans==false){
                al.add(ele);
            }
        }
        System.out.println(al);
    }
}

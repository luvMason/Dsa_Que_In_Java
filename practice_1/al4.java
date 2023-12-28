package practice_1;
import java.util.*;


public class al4 {
 public static void main(String[] args) {
       int arr[]={1,1,1,2,2,1,1,34,4,5,4,5,54,3,35,42};
ArrayList<Integer> al=new ArrayList<>();

for(int i=0;i<arr.length;i++){
    int ele=arr[i];


    boolean flag=al.contains(ele);
    if(flag==false){
        al.add(ele);
    }
}
System.out.println(al);

 }
    
}

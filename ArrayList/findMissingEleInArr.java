package ArrayList;
import java.util.*;
public class findMissingEleInArr {
    public static void main(String[] args) {
       int ans=0; 
    int sum=0;
    int n=5;
    int [] arr={1,3,4,5};

    ArrayList<Integer> res=new ArrayList<>();
    for(int i=0;i<arr.length;i++){
        res.add(arr[i]);
    }
    sum=(n*(n+1))/2;
    for(int i=0;i<res.size();i++){
           ans+=res.get(i);
    }
    System.out.println(sum-ans);
    }
    
}

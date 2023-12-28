package practice_1;
import java.util.*;

public class redupli {
    public static void main(String[] args) {
        int[]arr={1,2,2,2,3,5,6,7};

        int k=2;
        int count=0;

        for(int i=0;i<arr.length;i++){
           if(k==arr[i]){
            count++;
           }
        }
        int ans[]=new int[arr.length-count];

        int itr=0;
        for(int i=0;i<arr.length;i++){
            if(k!=arr[i]){
                ans[itr]=arr[i];
                itr++;
            }
        }

        System.out.println(Arrays.toString(ans));
    }
}

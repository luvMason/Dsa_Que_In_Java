package importantQues;

import java.util.Arrays;

public class reverseArray {
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5};
        int s=0;
        int e=arr.length-1;
        while(s<e){
            int t=arr[s];
            arr[s]=arr[e];
            arr[e]=t;
            s++;
            e--;
        }

        System.out.println(Arrays.toString(arr));
    }
    
}

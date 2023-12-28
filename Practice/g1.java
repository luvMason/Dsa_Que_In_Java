package Practice;

import java.util.Arrays;

public class g1 {
    public static void main(String[] args) {
        int[]arr={1,2,2,33,55};
        int[]arr1={3,4,63,2};
        int copy[]=new int[arr.length+arr1.length];
        for(int i=0;i<arr.length;i++){
            copy[i]=arr[i];
        }
        for(int i=0;i<arr1.length;i++){
            copy[arr.length+i]=arr1[i];
        }

        System.out.println(Arrays.toString(copy));
    }
    
}

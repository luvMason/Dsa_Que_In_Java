package Array;

import java.util.*;

public class concatenate {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int[] arr1 = { 6, 7, 8 };
        int l = arr.length;
        int[] copy = new int[arr.length + arr1.length];
        for (int i = 0; i < arr.length; i++) {
            copy[i] = arr[i];

        }
        for (int i = 0; i < arr1.length; i++) {

            copy[i + l] = arr1[i];

        }

        // for(int i=0;i<copy.length;i++){

        // System.out.print(copy[i]);
        // }

        System.out.println(Arrays.toString(copy));
    }

}

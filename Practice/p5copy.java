package Practice;

import java.util.*;

public class p5copy {
    public static void main(String[] args) {
        int[] arr={4,56,78,87};
        int[] copy=new int[arr.length];

        for(int i=0;i<arr.length;i++){
            copy[i]=arr[i];
        }
        System.out.println(Arrays.toString(copy));
    }
    
    
}

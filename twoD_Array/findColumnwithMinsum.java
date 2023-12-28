package twoD_Array;
import java.util.*;
public class findColumnwithMinsum {
    public static void main(String[] args) {

        int arr[][] = { { 1, 2, 3, 4 },
                      { 11, 33, 34, 44 } };
                int min=Integer.MAX_VALUE;

        for (int j = 0; j < arr[0].length; j++) {
                   int sum=0;
            for (int i = 0; i < arr.length; i++) {
                  sum+=arr[i][j];
            }
            if(min>sum){
                min=sum;
      
               
            }

        }
        System.out.println(min);
    }
}


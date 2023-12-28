package twoD_Array;

import java.util.Arrays;

public class reverseRow {
    public static void main(String[] args) {
        int arr1[]={1,2,3,4};
        int arr2[]={1,2,3,4};
        int arr3[]={1,2,3,4};
        int arr4[]={1,2,3,4};

        int [][]matrix={arr1,arr2,arr3,arr4};
        for(int i=0;i<matrix.length;i++){

            int[] target=matrix[i];
            //this is just reversing the array
            int s=0;
            int e=target.length-1;

            while(s<e){
                int t=target[s];
                target[s]=target[e];
                target[e]=t;
                s++;
                e--;
            }
        }
        System.out.println(Arrays.deepToString(matrix));

    }
    
}

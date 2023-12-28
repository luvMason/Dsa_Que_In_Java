package practice_1;
import java.util.*;
public class d2a3 {
    public static void main(String[] args) {
         int arr[][]={{11,12,13,14},
                     {21,22,23,24},
                     {31,32,33,34},
                     {41,42,43,44}};


        // for(int i=0;i<arr.length;i++){
        //     int []target=arr[i];

        //     int s=0;
        //     int e=target.length-1;

        //     while(s<e){
        //         int t=target[s];
        //         target[s]=target[e];
        //         target[e]=t;
        //         s++;
        //         e--;
        //     }
        // }

        // System.out.println(Arrays.deepToString(arr));




        for(int r=0;r<arr.length;r++){
            for(int c=r;c<arr[0].length;c++){
                int k=arr[r][c];
                arr[r][c]=arr[c][r];
                arr[c][r]=k;
            }
        }
        System.out.println(Arrays.deepToString(arr));
    }
    
}

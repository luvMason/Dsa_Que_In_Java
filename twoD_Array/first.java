package twoD_Array;
import java.util.*;
public class first {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
         int arr[][]=new int [n][m];
        int r=arr.length;
        int c=arr[0].length;

         for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                 arr[i][j]=sc.nextInt();
               
            }
           
         }
     //     for(int i=0;i<arr.length;i++){
     //        for(int j=0;j<arr[0].length;j++){
     //             System.out.print(arr[i][j]+" ");
               
     //        }
     //        System.out.println();
           
     //     }
     System.out.println(Arrays.deepToString(arr));
    }
    
}

package Practice;

import java.util.Arrays;

public class u13 {
    public static void main(String[] args) {
        int[][] arr = { { 1, 0, 0, 0},
                        { 2, 1, 0, 0},
                        { 2, 2, 1, 0},
                        { 2, 2, 2, 1} };


          for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr[0].length;j++){
                int k=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=k;
            }
          }   
          System.out.println(Arrays.deepToString(arr));           
    
}
}

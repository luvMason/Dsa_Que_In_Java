package AllQuestion.twodArray;

import java.util.Arrays;

import Array.sort;
import whileLoopBasic.sumOfNat;

public class length {

    public static void main(String[] args) {
        int [][]arr={{0,0,0,1},
                     {1,1,0,0},
                     {0,1,0,1},
                     {0,1,0,0}};


      for(int i=0;i<arr.length;i++){
        for(int j=i;j<arr[0].length;j++){
            int t=arr[i][j];
            arr[i][j]=arr[j][i];
            arr[j][i]=t;
        }
      }

      System.out.println(Arrays.deepToString(arr));
        
    }

   


}


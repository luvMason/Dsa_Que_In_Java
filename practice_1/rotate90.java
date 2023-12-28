package practice_1;

import java.util.Arrays;

import twoD_Array.spiralTrav;

public class rotate90 {
    public static void main(String[] args) {
        int arr1[][]={{1,2,3,4},
                      {12,13,14,15},
                      {21,22,23,24},
                      {31,32,33,34}};
            for(int i=0;i<arr1.length;i++){
                for(int j=i;j<arr1[0].length;j++){
                    int k=arr1[i][j];
                    arr1[i][j]=arr1[j][i];
                    arr1[j][i]=k;
                }
            } 
            
            
            for(int i=0;i<arr1.length;i++){
                int target[]=arr1[i];

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
            System.out.println(Arrays.deepToString(arr1));
    }
    
}

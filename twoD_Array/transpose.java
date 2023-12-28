package twoD_Array;

import java.util.Arrays;

public class transpose {
    public static void main(String[] args) {
        int arr[][]={{1,1,1,1},
                     {2,2,2,2},
                    {3,3,3,3},
                {4,4,4,4}};
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

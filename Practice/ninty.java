package Practice;

import java.util.Arrays;

public class ninty {
   public static void main(String[] args) {
    
   
        int [][]arr={{1,2,3,4},{1,2,3,4},{6,7,8,9},{01,02,03,04}};

        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr[0].length;j++){
                int k=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=k;
            }
        }

        for(int i=0;i<arr.length;i++){
            int target[]=arr[i];

            int start=0;
            int end=target.length-1;
            while(start<end){
                int t=target[start];
                target[start]=target[end];
                target[end]=t;
                start++;
                end--;
            }
        }
        System.out.println(Arrays.deepToString(arr));
    }
    
}

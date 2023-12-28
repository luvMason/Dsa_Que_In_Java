package twoD_Array;

import java.util.Arrays;

public class nintyDeegre {
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
           for(int i=0;i<arr.length;i++){

           

       int []target=arr[i];
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
        System.out.println(Arrays.deepToString(arr));

    }
}


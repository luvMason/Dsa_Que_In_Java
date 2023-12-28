package AllQuestion;

import java.util.Arrays;

public class t3 {

    public static void main(String[] args) {
        int arr[][]={{1,2,3,4},
                     {2,2,2,2},
                     {4,3,2,1},
                     {1,1,1,1}};

    for(int i=0;i<arr.length;i++){
        for(int j=i;j<arr[0].length;j++){
            int t=arr[i][j];
            arr[i][j]=arr[j][i];
            arr[j][i]=t;
        }
    }

    for(int i=0;i<arr.length;i++){
        int[] target=arr[i];

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

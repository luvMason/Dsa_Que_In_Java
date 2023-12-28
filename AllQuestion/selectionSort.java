package AllQuestion;

import java.util.Arrays;

public class selectionSort {

    public static void main(String[] args) {
        int arr[]={7,8,3,9,1};

        for(int i=0;i<arr.length;i++){
            int minIdx=i;

            for(int j=i+1;j<arr.length;j++){
                if(arr[minIdx]>arr[j]){
                    minIdx=j;
                }
            }

            int t=arr[minIdx];
            arr[minIdx]=arr[i];
            arr[i]=t;

        }

        System.out.println(Arrays.toString(arr));
    }
    
}

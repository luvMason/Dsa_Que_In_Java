package sorting.repeat;

import java.util.Arrays;

public class bubble {
    public static void main(String[] args) {
        int arr[]={8,5,7,0,1};

        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int t=arr[i];
                    arr[i]=arr[j];
                    arr[j]=t;
                }
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}

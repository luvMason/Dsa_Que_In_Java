package sorting;

import java.util.Arrays;

public class selectionsort {
    public static void main(String[] args) {
        
    int arr[]={7,8,3,9,1};
    
    
    for(int i=0;i<arr.length-1;i++){
        int minIdx=i;
        for(int j=i+1;j<arr.length;j++){
            if(arr[minIdx]>arr[j]){
                minIdx=j;
            }
                }
                int k=arr[minIdx];
                arr[minIdx]=arr[i];
                arr[i]=k;
            }

       
    System.out.println(Arrays.toString(arr));
    }
    
}

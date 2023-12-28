package sorting.repeat;

import java.util.Arrays;

public class isersion {
    public static void main(String[] args) {
        int arr[]={8,5,7,0,1};
        for(int i=1;i<arr.length;i++){
            for(int j=i;j>0;j--){
                if(arr[j-1]>arr[j]){
                    int t=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=t;
                }else{
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    
}

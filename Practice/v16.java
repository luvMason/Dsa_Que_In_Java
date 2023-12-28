package Practice;

import java.util.Arrays;

public class v16 {
    public static void main(String[] args) {
        int arr[]={0,1,0,0,1,1};
        int l=arr.length;
        for(int i=0;i<arr.length;i++){
            for(int k=i+1;k<arr.length;k++){
                if(arr[i]<=arr[k]){

                }else{
                    int t=arr[i];
                    arr[i]=arr[k];
                    arr[k]=t;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        
        
    }
    
}

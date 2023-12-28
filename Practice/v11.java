package Practice;

import java.util.Arrays;

public class v11 {
    public static void main(String[] args) {
        int arr1[]={1,2,3,45,5};
        int arr2[]={1,2,3,45,5};
        int res[]=new int[arr1.length + arr2.length];

        for(int i=0;i<arr1.length;i++){
            res[i]=arr1[i];
        }
        for(int k=0;k<arr2.length;k++){
            res[arr1.length+k]=arr2[k];
        }
        System.out.println(Arrays.toString(res));

    }
    
}

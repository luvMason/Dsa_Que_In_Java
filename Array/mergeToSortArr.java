package Array;

import java.util.Arrays;

public class mergeToSortArr {
    public static void main(String[] args) {
        int[] arr1 = { 1, 3, 4, 8 };
        int[] arr2 = { 2, 5, 6, 7 ,9,10};
        int[] res = new int[arr1.length + arr2.length];
             
        int p1=0;
        int p2=0;
        int p3=0;

        while(p1!=arr1.length && p2!=arr2.length){
            if(arr1[p1]>arr2[p2]){
                res[p3]=arr2[p2];
                p2++;
                p3++;
            }else{
               res[p3]=arr1[p1];
                p3++;
                p1++;

            }
        }
         if(p1==arr1.length){
            for(int i=p3;i<res.length;i++){
                res[i]=arr2[p2];
                p2++;
            }
        }else{
            for(int i=p3;i<res.length;i++){
                res[i]=arr1[p1];
                p1++;
            }

        }
        System.out.println(Arrays.toString(res));
    }
    
}

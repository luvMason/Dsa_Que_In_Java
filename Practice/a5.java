package Practice;

import java.util.Arrays;

public class a5 {
    public static void main(String[] args) {
        int arr1[]={1,2,3,4,5};
        int arr2[]={11,12,33,44,55,88};
        int res[]=new int[arr1.length + arr2.length];

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
                p1++;
                p3++;

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

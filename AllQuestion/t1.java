package AllQuestion;

import java.util.Arrays;

public class t1 {
    public static void main(String[] args) {
        int arr[]={1,2,3,5,6};
        int arr1[]={4,7,8,9};

        int res[]=new int[arr.length+arr1.length];

        int p1=0;
        int p2=0;
        int p3=0;

        while(p1!=arr.length&&p2!=arr1.length){
           
            if(arr[p1]>arr1[p2]){
                res[p3]=arr1[p2];
                p2++;
                p3++;
            }else{
                 res[p3]=arr[p1];
                p1++;
                p3++;
            }
        }
        if(p1==arr.length){
            for(int i=p3;i<res.length;i++){
                res[i]=arr1[p2];
                p2++;
            }
        }else{
            for(int i=p3;i<res.length;i++){
                res[i]=arr[p1];
                p1++;
            }
        }

        System.out.println(Arrays.toString(res));
    }
    
}

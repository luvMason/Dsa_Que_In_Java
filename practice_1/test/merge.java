package practice_1.test;

import java.util.Arrays;

public class merge {
    public static void main(String[] args) {
        
        int arr1[]={1,2,3,5};
        int arr2[]={9,4,6,7};

        int res[]=new int[Math.max(arr1.length,arr2.length)];

        int p1=arr1.length-1;
        int p2=arr2.length-1;
        int p3=res.length-1;

        int carry=0;

        while(p1>=0||p2>=0){
            int d1=p1>=0?arr1[p1]:0;
            int d2=p2>=0?arr2[p2]:0;

            int sum=d1+d2+carry;

            int rd=sum%10;
            carry=sum/10;

            res[p3]=rd;

            p1--;
            p2--;
            p3--;
        }

        if(carry>0){
            int res2[]=new int[res.length + 1];
            res2[0]=carry;
            for(int i=0;i<res.length;i++){
                res2[i+1]=res[i];

            }
            res=res2;
        }

        System.out.println(Arrays.toString(res));

    }
}

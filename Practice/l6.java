package Practice;

import java.util.Arrays;

public class l6 {
    public static void main(String[] args) {
        int arr1[]={9,9,9,9};
        int arr2[]={9};
        int l=Math.max(arr1.length,arr2.length);
        int res[]=new int[l];
        int p1=arr1.length-1;
        int p2=arr2.length-1;
        int p3=l-1;
         int sum=0;
         int carry=0;
        while(p1>=0 || p2>=0){
            int d1=p1>=0?arr1[p1]:0;
            int d2=p2>=0?arr2[p2]:0;
            
            sum=d1+d2+carry;
            int rd=sum%10;
            carry=sum/10;
            res[p3]=rd;
            p1--;
            p2--;
            p3--;
        }
        if(carry>0){
            int res1[]=new int[l+1];
            res1[0]=carry;
            for(int i=0;i<res.length;i++ ){
                res1[i+1]=res[i];
            }
            res=res1;
        }
        System.out.println(Arrays.toString(res));

    }
    
}

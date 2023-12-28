package importantQues;

import java.util.Arrays;

public class addTwoArray {
    public static void main(String[] args) {
        int[]arr1={1,2,3,4,5};
        int []arr2={9,9,9};
        int l=Math.max(arr1.length,arr2.length);
        int res[]=new int[l];

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
            int ans[]=new int[l+1];
            ans[0]=carry;
            for(int i=0;i<res.length;i++){
                ans[i+1]=res[i];
            }
            res=ans;
        }
        System.out.println(Arrays.toString(res));
    }
    
}

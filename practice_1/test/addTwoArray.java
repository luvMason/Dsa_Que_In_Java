package practice_1.test;
import java.util.*;
public class addTwoArray {

    public static void main(String[] args) {
        
    
    int[] arr1 = { 4, 5, 6, 7 };
    int[] arr2 = { 9, 5, 2, 9 };

    
        int l=Math.max(arr1.length, arr2.length);
        int ans[]=new int[l];

        

        int p1=arr1.length-1;
        int p2=arr2.length-1;
        int p3=l-1;

        int carry=0;

        while(p1>=0||p2>=0){
            int d1=p1>=0?arr1[p1]:0;
            int d2=p2>=0?arr2[p2]:0;

            int sum = d1+d2+carry;
            int rd=sum%10;
            carry=sum/10;

            ans[p3]=rd;

            p1--;
            p2--;
            p3--;




        }
        if(carry>0){
            int res[]=new int[l+1];
            res[0]=carry;
            for(int i=0;i<ans.length;i++){
                res[i+1]=ans[i];
            }
          ans=res;         
        }
        System.out.println(Arrays.toString(ans));

    
    }
}

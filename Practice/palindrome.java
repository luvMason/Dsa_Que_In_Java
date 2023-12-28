package Practice;
import java.util.*;

import forLoopBasic.sumOfNatural;
import whileLoopBasic.sumOfNat;

public class palindrome {
    public static void main(String[] args) {
        
        // int arr[]={1,2,23,22,22};

        // int max=0;
        
        // for(int i=0;i<arr.length;i++){
        //    if(max<arr[i]){
        //     max=arr[i];
        //    }
        // }

        // System.out.println(max);
        // Arrays.sort(arr);

        // System.out.println(Arrays.toString(arr));

        // int s=0;
        // int e=arr.length-1;
        // while(s<e){
        //     int t=arr[s];
        //     arr[s]=arr[e];
        //     arr[e]=t;
        //     s++;
        //     e--;
        // }
        // System.out.println(Arrays.toString(arr));

        // int[] copy=new int[arr.length];

        // for(int i=0;i<arr.length;i++){
        //     copy[i]=arr[i];

        // }
        // System.out.println(Arrays.toString(copy));

        //int x=22;

        // for(int i=0;i<arr.length;i++){
        //     if(arr[i]==x){
        //         System.out.println(i);
        //     }
        // }

        // boolean flag=true;
        // int first=-1;
        // int last=-1;

        // for(int i=0;i<arr.length;i++){
        //     if(x==arr[i]&&flag==true){
        //         first=i;
        //         flag=false;
        //     }else if(x==arr[i]){
        //         last=i;
        //     }
        // }

        // System.out.println(first+" "+last);


    //     int count=0;
    //     for(int i=0;i<arr.length;i++){
    //         if(x==arr[i]){
    //             count++;
    //         }
    //     }
    //     System.out.println(count);
    // 

    // int arr1[]={88,99,55,44};

    // int cont[]=new int[arr.length+arr1.length];

    // for(int i=0;i<arr.length;i++){
    //     cont[i]=arr[i];
    // }

    // for(int i=0;i<arr1.length;i++){
    //     cont[arr.length+i]=arr1[i];
    // }

    // System.out.println(Arrays.toString(cont));

    // int y=4;
    // int ans[]=new int[arr.length-1];

    // int itr=0;

    // for(int i=0;i<arr.length;i++){
    //     if(y!=arr[i]){
    //         ans[itr]=arr[i];
    //         itr++;
    //     }
    // }

    // System.out.println(Arrays.toString(ans));

    // int min=Integer.MAX_VALUE,max=0;
    // for(int i=0;i<arr.length;i++){
    //     if(max<arr[i]){
    //         max=arr[i];
    //     }
    //     if(min>arr[i]){
    //         min=arr[i];
    //     }
    // }

    // System.out.println(min+" "+max);


    // int arr1[]={1,2,3,4,5};
    // for(int i=0;i<arr.length;i++){
    //     for(int j=0;j<arr1.length;j++){
    //         if(8==arr[i]+arr1[j]){
    //             System.out.println(i+" "+ j);
    //         }
    //     }
    // }
        //      int count=0;
        //   for(int i=0;i<arr.length;i++){
        //     if(arr[i]%2==0){
        //         count++;
        //     }
        //   }  
        //   System.out.println(count);  

        // boolean flag=true;

        // for(int i=0;i<arr.length-1;i++){
        //     if(arr[i]>arr[i+1]){
        //         flag=false;
        //     }
        // }

        // System.out.println(flag);



        // int count=0;
       
        // for(int i=0;i<arr.length;i++){
        //     if(x==arr[i]){
        //         count++;
        //     }
        // }

        // int itr=0;
        // int ans[]=new int[arr.length-count];
        // for(int i=0;i<arr.length;i++){
        //     if(x!=arr[i]){
        //        ans[itr]=arr[i];
        //        itr++;
        //     }
        // }

        // System.out.println(Arrays.toString(ans));
         

        // int pro=1;
        // for(int i=1;i<arr.length;i+=2){
        //     // if(i%2!=0){
        //         System.out.println(pro+"*"+arr[i]+"=");
        //       pro*=arr[i];
        //     // }
        // }
        // System.out.println(pro);


        int[] arr = { 4, 5, 6, 7 };
        int[] arr1 = { 8, 5, 8, 9 };
    
        int l=Math.max(arr.length,arr1.length);
        int res[]=new int[l];

        int p1=arr.length-1;
        int p2=arr1.length-1;
        int p3=l-1;

         int carry=0;
        while(p1>=0 || p2>=0){
              
           int v1=p1>=0?arr[p1]:0;
           int v2=p2>=0?arr1[p2]:0;

           int d=v1+v2+carry;

           int rd=d%10;
           carry=d/10;

           res[p3]=rd;

           p1--;
           p2--;
           p3--;


        }

        if (carry > 0) {
            int[] res2 = new int[l + 1];
            res2[0] = carry;
            for (int i = 0; i < res.length; i++) {
              res2[i + 1] = res[i];
            }
            res=res2;
          }
          System.out.println(Arrays.toString(res));
      
        }

    }
    


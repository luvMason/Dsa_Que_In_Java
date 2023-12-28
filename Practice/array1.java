package Practice;

import java.util.*;

public class array1 {
    public static void main(String[] args) {
        // int[] arr; //decelaration

        // arr=new int[5]; //initialization

        // int[] arr={23,45,67,12,67};
        // Arrays.sort(arr); //sorting an array
        // for(int i=1;i<=arr.length-1;i++){
        // System.out.print(arr[i]+" ");
        // }

        // int[] arr={23,45,67,12,67};

        // for(int i=1;i<=arr.length-1;i++){ //printing an array
        // System.out.print(arr[i]+" ");
        // }

        // int[] arr={23,45,67,12,67};
        // int max=Integer.MIN_VALUE; //find max
        // for(int i=1;i<=arr.length-1;i++){
        // if(max<arr[i]){
        // max=arr[i];
        // }

        // }
        // System.out.print(max);

        // int[] arr={23,45,67,12,67};
        // int min=Integer.MAX_VALUE; //find min
        // for(int i=1;i<=arr.length-1;i++){
        // if(min>arr[i]){
        // min=arr[i];
        // }

        // }
        // System.out.print(min);

        // int[] arr={12,34,45,23};
        // System.out.println(arr[0]);
        // arr[0]=200; //change element an array
        // System.out.println(arr[0]);

        // int[] arr={12,34,45,23};
        // int t;
        // int s=0;
        // int e=arr.length-1;
        // while(s<e){
        // t=arr[s]; //reverse the array
        // arr[s]=arr[e];
        // arr[e]=t;
        // s++;
        // e--;
        // }
        // for(int i=0;i<arr.length;i++){
        // System.out.println(arr[i]);
        // }

        // int[] arr={12,34,45,23};
        // int[] copy=new int[arr.length];

        // for(int i=0;i<arr.length;i++){
        // copy[i]=arr[i]; // copy the array
        // }
        // for(int i=0;i<arr.length;i++){
        // System.out.print(copy[i]+ " ");
        // }

        int[] arr = { 23, 45, 67, 12, 67 };
        int k = 45;
        int ans = -1;

        for (int i = 1; i <= arr.length - 1; i++) {
            
            if (k == arr[i]) {
                ans=i;
            }

        }
        System.out.println(ans);

    }
}

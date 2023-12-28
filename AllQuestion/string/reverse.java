package AllQuestion.string;

import AllQuestion.twodArray.length;
import java.util.*;

public class reverse {
  public static void main(String[] args) {

   int arr1[]={1,2,4,5};
   int arr2[]={3,6,7,8};
   int arr3[]= new int[8];

   int p1 = 0;
   int p2 =0;
   int p3 = 0; 
    

   while (p1 != arr1.length && p2!= arr2.length )
   {
     if (arr1[p1]>arr2[p2])
     {
       arr3[p3] = arr2[p2];
       p3++;
       p2++;
     }
     else
     {
       arr3[p3] = arr1[p1];
        p3++;
        p1++;
     }
   }

   if (p1 == arr1.length)
   {

    for(int i=p3;i<arr3.length;i++){

      arr3[i] = arr2[p2];
        
         p2++;
    }

   }else
    {
         for(int i=p3;i<arr3.length;i++){

      arr3[i] = arr1[p1];
        
         p1++;
    }

  }

  System.out.println(Arrays.toString(arr3));
}
}
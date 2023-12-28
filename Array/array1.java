package Array;

public class array1 {
    public static void main(String[] args) {
        
    
//     int [] arr;  // declaration
//     arr=new int[5]; // inialization

         int[] arr=new int[5];
         int[] arr2 = {1,2,3,4,5};
        

        //      System.out.println(arr2[0]); //access a element
         
        //      // change a element in array
        //    arr2[0]=100;
        //    System.out.println(arr2[0]);

        //lenght of array
        // int length=arr2.length;
        //  System.out.println(length);

        // for(int i=0;i<arr.length;i++){             //iterate and printing a array
        //     System.out.println(arr2[i]);
           
        //     }
        int min=Integer.MAX_VALUE;             
    for(int i=0;i<arr.length;i++){
           if(min>arr2[i]){
            min=arr2[i];
           }
        }
        System.out.println(min);
    }

        

 }

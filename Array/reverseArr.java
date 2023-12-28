package Array;

public class reverseArr {
    public static void main(String[] args) {
        int[] arr = {23,1,10,67,45,78};
        
       

       int[] res=new int[arr.length];
       for(int i=arr.length-1;i>=0;i--){
                
           res[arr.length-i-1]=arr[i];
           System.out.println(res[arr.length-i-1]);
       }

   
        
     }


    }


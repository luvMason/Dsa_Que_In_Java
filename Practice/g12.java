package Practice;

public class g12 {
    public static void main(String[] args) {
        int arr1[]={5,3,4,666,33,55};
         int arr2[]={5,3,44,666,333,55};

         for(int i=0;i<arr1.length;i++){
           for(int j=0;j<arr2.length;j++){
               if(arr1[i]==arr2[j]){
                System.out.println(i);
               }
           }
         }
    }
    
}

package Practice;

public class p1Max {
    public static void main(String[] args) {
        
    
    int max=Integer.MIN_VALUE;
    int[] arr={34,56,77,88,98,9};

    for(int i=0;i<arr.length;i++){
         if(max<arr[i]){
            max=arr[i];
         }
    }
    System.out.println(max);
    
}
}

package Practice;

public class p2min {
    public static void main(String[] args) {
        int min=Integer.MAX_VALUE;
    int[] arr={34,56,77,88,98,9};

    for(int i=0;i<arr.length;i++){
         if(min>arr[i]){
            min=arr[i];
         }
    }
    System.out.println(min);
    }
    
}

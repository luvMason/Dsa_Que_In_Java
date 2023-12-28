package Array;

public class max {public static void main(String[] args) {
    int[] arr = {-23,-1,-10,-67,-45,-78};
        int max=Integer.MIN_VALUE;             
    for(int i=0;i<arr.length;i++){
           if(max<arr[i]){
            max=arr[i];
           }
        }
        System.out.println(max);
}

    
}

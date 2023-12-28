package Array;

public class diffBtwMaxMin {
    public static void main(String[] args) {
        int[] arr={4,6,8,9,1};
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
             if(min>arr[i]){
                min=arr[i];
            }
            
        }
        int diff=max-min;
        System.out.println(diff);
        
        
        
    }
    
}

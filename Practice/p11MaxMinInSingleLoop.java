package Practice;

public class p11MaxMinInSingleLoop {
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
        
        System.out.println(max+" "+min);
        
        
    }
    
}

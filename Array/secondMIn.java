package Array;

public class secondMIn {
    public static void main(String[] args) {
        int min=Integer.MAX_VALUE;
         
        int smin=Integer.MAX_VALUE;
        int[] arr={7,3,19,100,2,0,1};
        for(int i=0;i<arr.length;i++){
            if(min>arr[i]){
                smin=min;
                min=arr[i];
             
            }else if(smin>arr[i]){
                smin=arr[i];
            }
            
            
             }
             System.out.println(min+" "+smin);
    }
}

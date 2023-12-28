package Practice;

public class v13 {
    public static void main(String[] args) {
        int arr[]={32,34,108,209,200};
        int max=Integer.MIN_VALUE;
         int smax=Integer.MIN_VALUE;

         for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                smax=max;
                max=arr[i];
            }else if(smax<arr[i]){
                smax=arr[i];
            }
         }
         System.out.println(max+" "+smax);
    }
    
}

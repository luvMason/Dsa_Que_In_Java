package Practice;

public class v6 {
    public static void main(String[] args) {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int arr[]={11,2,3,4,5,6,33};
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
             if(min>arr[i]){
                min=arr[i];
            }
        }
        System.out.println(max-min);
    }
    
}

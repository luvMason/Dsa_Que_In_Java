package Practice;

public class p22 {
    public static void main(String[] args) {
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        int [] arr={2,1,66,99};
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

package Practice;

public class g3 {
    public static void main(String[] args) {
        int arr[]={45,67,98,304,-1,-493};
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=1;i<arr.length;i++){
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

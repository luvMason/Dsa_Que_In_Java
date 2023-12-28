package Practice;

public class g8 {
    public static void main(String[] args) {
        int arr[]={3,3,4,5,46,4};
        boolean flag =true;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                flag =false;
            }
        }
        System.out.println(flag);
    }
    
}

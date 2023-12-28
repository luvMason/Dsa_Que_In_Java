package Practice;

public class v12 {
    public static void main(String[] args) {
        int arr[]={12,34,5,6,7,4};
        int k=40;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==k){
                    System.out.println(i+" "+j);
                }
            }
        }
    }
    
}

package practice_1;

public class a6 {
    public static void main(String[] args) {
        int arr[]={1,2,3,2,4,2,5,35,6,7};
        int sum=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                sum+=arr[i];
            }
        }
        System.out.println(sum);
    }
    
}

package Practice;

public class g10 {
    public static void main(String[] args) {
        int arr[]={1,33,45,653,33,23};
        int sum=0;
        for(int i=0;i<arr.length;i++){
            if(i%2==0){
                sum+=arr[i];
            }
        }
        System.out.println(sum);
    }
    
    
}

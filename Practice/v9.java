package Practice;



public class v9 {
    public static void main(String[] args) {
        int n=10;
        int arr[]={1,2,3,4,5,6,8,9,10};
       int osum=(n*(n+1))/2;
       int sum=0;
       for(int i=0;i<arr.length;i++){
        sum+=arr[i];
       }
    
    System.out.println(osum-sum);
    }
    
}

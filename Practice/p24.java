package Practice;

public class p24 {
    public static void main(String[] args) {
       int ans=0; 
    int sum=0;
    int n=5;
    int [] arr={2,3,4,5};
    sum=(n*(n+1))/2;
    for(int i=0;i<arr.length;i++){
           ans+=arr[i];
    }
    System.out.println(sum-ans);
    }
}

package practice_1;

public class focc {
    public static void main(String[] args) {
       int arr[]={2,7,7,7,7,7,7,7,7};

        int s=0;
        int e=arr.length-1;
        int ans=-1;
        int k=7;
        while(s<=e){

            int mid=(s+e)/2;
            if(k==arr[mid]){
                s=mid+1;
                ans=mid;

            }else if(k>arr[mid]){
                s=mid+1;
            }else if(k<arr[mid]){
                e=mid-1;
            }
        }
        System.out.println(ans);
     
    }
    
}

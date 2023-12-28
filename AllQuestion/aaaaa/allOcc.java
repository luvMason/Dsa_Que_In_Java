package AllQuestion.aaaaa;

public class allOcc {
    public static void main(String[] args) {
        int arr[]={1,2,3,3,3,3,3,3,3,3,3};

        int k=3;

        int fo=first(arr,k);
        int lo=last(arr,k);

        int all= lo - fo +1;

        System.out.println(all);
        System.out.println(lo);
        System.out.println(fo);

        
    }

    public static int first(int arr[],int k){
        int s=0;
        int e=arr.length-1;
        int mid=-1;
        int ans=-1;
        while(s<=e){
            mid=(s+e)/2;

            if(arr[mid]==k){
                ans=mid;
                e=mid-1;
            }else if(arr[mid]>k){
                e=mid-1;
            }else{
                s=mid+1;
            }
            

        }

        return ans;
    }
    public static int last(int arr[],int k){
        int s=0;
        int e=arr.length-1;
        int mid=-1;
        int ans=-1;
        while(s<=e){
            mid=(s+e)/2;

            if(arr[mid]==k){
                ans=mid;
                s=mid+1;
            }else if(arr[mid]>k){
                e=mid-1;
            }else{
                s=mid+1;
            }

            

        }

        return ans;
    }
    
}

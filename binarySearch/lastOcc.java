package binarySearch;

public class lastOcc {

 
    
public static void main(String[] args) {
        int arr[]={10,20,30,30,70,80,90};
        int k=30;
        int s=0;
        int e=arr.length-1;
        int ans=-1;
        while(s<=e){
            
            int mid=(s+e)/2;
            if(arr[mid]==k){
                
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


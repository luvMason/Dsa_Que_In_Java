package AllQuestion.binarySearch;

public class searchInRotatedSortedArray {
    public static void main(String[] args) {
        int[] arr = { 70,80,90,10,20,30,40,50,60};
      
       int ans=search(arr,80,0,arr.length-1);
       System.out.println(ans);
    }
    public static int search(int arr[],int k,int s,int e){
          while(s<=e){
            int mid=(s+e)/2;
            if(arr[mid]==k){
                return mid;
            }else if(arr[s]<=arr[mid]){
                if(k>=arr[s]&&k<arr[mid]){
                    e=mid-1;
                }else{
                    s=mid+1;
                }
            }else{
                if(k>arr[mid]&&k<=arr[e]){
                    s=mid+1;
                }else{
                    e=mid-1;
                }
            }
        }

        return -1;
    }
    
}

package practice_1;

public class rec {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,15,0,7};
        
        int ans=findMax(arr,0);
        System.out.println(ans);
    }
    public static int findMax(int []arr,int idx){
        if(idx==arr.length){
            return -1;
        }
       
       int reMax=findMax(arr,idx+1);
       int max=Math.max(reMax,arr[idx]);
       return max;
    }
    
}

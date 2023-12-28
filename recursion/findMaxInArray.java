package recursion;

public class findMaxInArray {
     public static void main(String[] args) {
        int[]arr={1,22,3,4,5,6};
        int ans=max(arr,0);
        System.out.println(ans);
    }
    public static int  max(int [] arr,int idx){
        if(idx==arr.length){
            return Integer.MAX_VALUE;
        }
        
       int remMax=max(arr,idx+1);
        int  max=Math.min(remMax, arr[idx]);
        
        return max;
    }
}

    


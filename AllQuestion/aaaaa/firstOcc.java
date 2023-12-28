package AllQuestion.aaaaa;

import whileLoopBasic.sumOfNat;

public class firstOcc {
    public static void main(String[] args) {
        
        int arr[]={1,2,3,4,5,633,5,3};
        int ans=find(arr,0,3);
        System.out.println(ans);
    }

    public static int find(int[] arr,int idx, int k){
        if(idx==arr.length){
            return -1;
        }else if(arr[idx]==k){
            return idx;
        }else{
            int ans=find(arr,idx+1,k);
            return ans;
        }
        
    }
}

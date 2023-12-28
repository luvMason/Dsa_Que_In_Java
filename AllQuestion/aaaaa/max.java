package AllQuestion.aaaaa;

import whileLoopBasic.sumOfNat;

public class max {
    public static void main(String[] args) {
        
        int arr[]={22,33,44,54,6,5};
        int ans=max(arr,0);
        System.out.println(ans);
    }

    public static int max(int arr[],int idx){
       
        if(idx==arr.length){
            return -1;
        }

        int pre=max(arr,idx+1);
        int ans=Math.max(pre,arr[idx]);

        return ans;
    }
}

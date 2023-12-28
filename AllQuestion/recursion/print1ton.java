package AllQuestion.recursion;

public class print1ton {
    public static void main(String[] args) {
       int arr[]={1,2,3,4,5};
     int ans=  display(arr,0);
     System.out.println(ans);

    }
    public static int  display(int arr[],int idx){
       if(idx==arr.length){
          return Integer.MIN_VALUE  ;
       }
       int preMax=display(arr, idx+1);
       int max=Math.max(preMax,arr[idx]);
       return max;

       
    }


    
}

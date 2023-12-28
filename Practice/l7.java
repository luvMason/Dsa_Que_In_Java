package Practice;

public class l7 {
    public static void main(String[] args) {
        int arr[]={9,8,0,4,1};
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        for(int h=max;h>0;h--){
            for(int i=0;i<arr.length;i++){
                if(arr[i]>=h){
                    System.out.print("*\t");
                }else{
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
    
}

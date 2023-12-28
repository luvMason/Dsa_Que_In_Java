package Practice;

public class v15 {
    public static void main(String[] args) {
        int arr[]={1,2,3,0,4,5};
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        for(int h=max;h>0;h--){
            for(int i=0;i<arr.length;i++){
                    if(h<=arr[i]){
                        System.out.print("*\t");

                    }else{
                        System.out.print("\t");
                    }
            }
            System.out.println();
        }
    }
    
}

package Practice;

public class r45 {
    public static void main(String[] args) {
        int []arr={3,2,1,0,5};
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            max=Math.max(max, arr[i]);
        }
        for(int h=max;h>0;h--){
            for(int j=0;j<arr.length;j++){
                if(h<=arr[j]){
                  System.out.print("*\t");
                }else{
                    System.out.print("\t");
                }
            }
            System.out.println();
        }

    }
    
}

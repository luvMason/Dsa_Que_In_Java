package twoD_Array;

public class maxOF2Array {
    public static void main(String[] args) {
        int arr[][]={{1,22,3},{1,2,3}};
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(max<arr[i][j]){
                    max=arr[i][j];
                }
            }
        }
        System.out.println(max);
    }

    
}

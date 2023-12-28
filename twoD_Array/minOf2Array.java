package twoD_Array;

public class minOf2Array {
    public static void main(String[] args) {
        int arr[][]={{1,22,3},{1,2,3}};
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(min>arr[i][j]){
                    min=arr[i][j];
                }
            }
        }
        System.out.println(min);
    
}
}
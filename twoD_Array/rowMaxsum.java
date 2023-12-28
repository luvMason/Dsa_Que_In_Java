package twoD_Array;

public class rowMaxsum {
     public static void main(String[] args) {
        int arr[][]={{1,22,3},{1,2,3}};
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=0;j<arr[0].length;j++){
                sum+=arr[i][j];
            }
            if(max<sum){
                max=sum;
               
            }
        }
        System.out.println(max);
       
    
}
    
}

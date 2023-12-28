package Array;

public class Twosum {
    public static void main(String[] args) {
       int  n=8;
       int[] arr={4,0,6,9,2};
       
       for(int i=0;i<arr.length;i++){
        for(int j=i+1;j<arr.length;j++){
          if( arr[i]+arr[j]==n){
            System.out.println(i+" "+j);
          }
                
            
        }
       }
       
    }
    
}

package twoD_Array;

public class printDiagonal {
    public static void main(String[] args) {
        
        int arr[][]={{00,01,02,03},
                     {10,11,12,13},
                     {20,21,22,23},
                     {30,31,32,33}};

        for(int k=0;k<arr.length;k++){
          for(int r=0;r<arr.length;r++){
            for(int c=0;c<arr[0].length;c++){
                if(r+k==c ){
                System.out.println(arr[r][c]);
                }
            }
          }
        }
    }
}
    


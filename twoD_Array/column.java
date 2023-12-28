package twoD_Array;

public class column {
    public static void main(String[] args) {
        int arr[][] = { { 1, 2, 3 ,4},
                        { 11, 33, 34 ,44} };

        for (int j = 0; j < arr[0].length; j++) {
            
            for (int i = 0; i< arr.length; i++) {
                System.out.println(arr[i][j]);
                
            }
            // System.out.println();
        }

    }

}

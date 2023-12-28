package twoD_Array;

public class zigZagCoulmn {
    public static void main(String[] args) {
        int arr[][] = { { 12, 33, 44 },
                        { 44, 33, 11 } };
        // for (int c = 0; c < arr[0].length; c++) {
        //     if (c % 2 == 0) {
        //         for (int r = 0; r < arr.length; r++) {
        //             System.out.println(arr[r][c]);
        //         }
        //     } else {
        //         for (int r = arr.length-1; r >= 0; r--) {
        //             System.out.println(arr[r][c]);
        //         }
        //     }
        // }
              boolean flag=true;
        for (int c = 0; c < arr[0].length; c++) {
            if (flag==true) {
                for (int r = 0; r < arr.length; r++) {
                    System.out.println(arr[r][c]);

                }
                flag=false;
            } else {
                for (int r = arr.length-1; r >= 0; r--) {
                    System.out.println(arr[r][c]);
                }
                flag=true;
            }
        }
    }

}

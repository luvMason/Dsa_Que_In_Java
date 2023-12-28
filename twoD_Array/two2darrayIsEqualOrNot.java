package twoD_Array;

public class two2darrayIsEqualOrNot {
    public static void main(String[] args) {

        int arr[][] = { { 1, 2, 3 }, { 1, 2, 3, 4 } };
        int arr1[][] = { { 1, 2, 3 }, { 11, 2, 3, 4 } };
        boolean flag = true;

        if (arr.length == arr1.length && arr[0].length == arr1[0].length) {

            for (int i = 0; i < arr.length; i++) {

                for (int j = 0; j < arr[0].length; j++) {
                    if (arr[i][j] != arr1[i][j]) {
                        flag = false;
                    }
                }
            }

        } else {
            flag = false;
        }
        System.out.println(flag);
    }
}

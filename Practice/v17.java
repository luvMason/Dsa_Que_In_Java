package Practice;

import java.util.Arrays;

public class v17 {
    public static void main(String[] args) {
        int arr[] = { 0, 2, 0 , 1, 2, 0 };
        for (int i = 0; i < arr.length-2; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                 for (int k = j + 1; k < arr.length; k++) {
                // int j=i+1;
                // int k=i+2;
                    if (arr[i] > arr[j]) {
                        int t = arr[i];
                        arr[i] = arr[j];
                        arr[j] = t;
                        if (arr[j] > arr[k]) {
                            t = arr[j];
                            arr[j] = arr[k];
                            arr[k] = t;
                        }
                    } else if (arr[j] > arr[k]) {

                        int t = arr[j];
                        arr[j] = arr[k];
                        arr[k] = t;

                    }
                }
            }
        }
        System.out.println(Arrays.toString(arr));

    }
}

package Array;

public class firstLastOcc {
    public static void main(String[] args) {
        // int[] arr = { 4, 5, 2, 6, 2, 7 };

        // int k = 2;
        // int f = -1;
        // int l = -1;
        // for (int i = 0; i <= arr.length - 1; i++) {
        // if (k == arr[i]) {
        // f = i;
        // break;

        // }
        // }
        // for (int i = arr.length - 1; i >= 0; i--) {
        // if (k == arr[i]) {
        // l = i;
        // break;
        // }

        // }
        // System.out.println(f);
        // System.out.println(l);
                                   // second method

        int[] arr = { 4, 5, 2, 6, 2, 7 };

        int k = 2;
        int f = -1;
        int l = -1;
        boolean flag = true;
        for (int i = 0; i <= arr.length - 1; i++) {
            if (k == arr[i] && flag == true) {
                f = i;
                flag = false;
            }
            if (k == arr[i]) {
                l = i;

            }

        }
        System.out.println(f);
        System.out.println(l);

    }
}

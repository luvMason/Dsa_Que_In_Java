package sorting;

import java.util.Arrays;

public class mergeSort {
    public static void main(String[] args) {
        int[] arr = { 7, 8, 3, 2, 1, 0, 6, 4 };

        int[] res = mergesort(arr, 0, arr.length - 1);

        System.out.println(Arrays.toString(res));
    }

    public static int[] mergesort(int[] arr, int start, int end) {
        if (start == end) {
            int[] base = new int[1];
            base[0] = arr[start];
            return base;
        }
        int mid = (start + end) / 2;
        int[] fsp = mergesort(arr, start, mid);
        int[] ssp = mergesort(arr, mid + 1, end);
  
        int[] res = mergeTwoSortArray(fsp, ssp);
        return res;
    }

    public static int[] mergeTwoSortArray(int[] arr1, int[] arr2) {

        int res[] = new int[arr1.length + arr2.length];

        int p1 = 0;
        int p2 = 0;
        int p3 = 0;
        while (p1 != arr1.length && p2 != arr2.length) {
            if (arr1[p1] > arr2[p2]) {
                res[p3] = arr2[p2];
                p3++;
                p2++;
            } else {
                res[p3] = arr1[p1];
                p3++;
                p1++;
            }
        }
        if (p1 == arr1.length) {
            for (int i = p3; i < res.length; i++) {
                res[i] = arr2[p2];
                p2++;

            }
        } else {
            for (int i = p3; i < res.length; i++) {
                res[i] = arr1[p1];
                p1++;

            }
        }
        return res;
    }
}

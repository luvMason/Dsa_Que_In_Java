package AllQuestion.binarySearch;

public class smallestElementInRotatecSortedArray {
    public static void main(String[] args) {

        int[] arr = { 70, 80, 90, 5, 20, 30, 40, 50, 60 };

        int ans = search(arr, 0, arr.length - 1);
        System.out.println(ans);
    }

    public static int search(int arr[], int s, int e) {
        if (arr.length == 0) {
            return -1;
        } 
        // else if (arr.length == 1) {
        //     return arr[0];
        // } else if (arr[0] < arr[arr.length - 1]) {
        //     return arr[0];
        // } 
        else {
            while (s <= e) {
                int mid = (s + e) / 2;

                if (mid != 0 && arr[mid] < arr[mid - 1]) {
                    return mid;
                } else if (mid != arr.length - 1 && arr[mid] > arr[mid + 1]) {
                    return mid + 1;
                } else if (arr[s] < arr[mid]) {
                    s = mid + 1;
                } else {
                    e = mid - 1;
                }

            }
        }
        return -1;
    }

}

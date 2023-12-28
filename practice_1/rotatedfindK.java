package practice_1;

public class rotatedfindK {
    public static void main(String[] args) {
        int[] arr = { 70, 80, 90, 10, 20, 30, 40, 50, 60 };
        int k = 90;

        int ans = find(arr, k);
        System.out.println(ans);

    }

    public static int find(int arr[], int k) {

        int s = 0;
        int e = arr.length - 1;
        while (s <= e) {
            int mid = (s + e) / 2;
            if (k == arr[mid]) {
                return mid;
            } else if (arr[s] <= arr[mid]) {
                if (k >= arr[s] && k < arr[mid]) {
                    e = mid - 1;
                } else {
                    s = mid + 1;
                }
            }else{
                 if (k > arr[mid] && k <= arr[e]) {
                    s = mid + 1;
                } else {
                    e = mid - 1;
                }
            }
        }
        return -1;
    }
}

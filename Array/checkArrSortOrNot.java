package Array;

public class checkArrSortOrNot {
    public static void main(String[] args) {
        int[] arr = { 33,45,45,66,67,99,234 };
        boolean flag = true;
        for (int i = 0; i < arr.length - 1; i++) {
            int k = i;

            if (arr[i] <= arr[k + 1]) {

            } else {
                flag = false;
            }

        }

        if (flag == true) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
    
}

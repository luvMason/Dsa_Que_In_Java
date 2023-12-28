package Array;

public class frequency {
    public static void main(String[] args) {
        int[] arr = { 23, 45, 45, 45, 67 };
        int k = 45;
        int count= 0;

        for (int i = 1; i <= arr.length - 1; i++) {
            
            if (k == arr[i]) {
                count++;
            }

        }
        System.out.println(count);
    }
    
}

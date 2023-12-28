package Array;

public class findElement {
    public static void main(String[] args) {
        int[] arr = { 23, 45, 67, 12, 67 };
        int k = 45;
        int ans = -1;

        for (int i = 1; i <= arr.length - 1; i++) {
            
            if (k == arr[i]) {
                ans=i;
            }

        }
        System.out.println(ans);
    }
    
}

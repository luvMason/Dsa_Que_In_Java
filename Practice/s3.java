package Practice;

public class s3 {
    public static void main(String[] args) {
        String s = "asdflkjhghqwertpyoyiu mznxbcv vvvvvvvv ffff";
        char ans = calculateFeq(s);
        System.out.println(ans);

    }

    public static char calculateFeq(String str) {
        int arr[] = new int[26];
        int maxIdx = 0;
        int smaxIdx = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                int idx = (int) (ch - 'a');
                arr[idx] += 1;
            } else if (ch >= 'A' && ch <= 'Z') {
                int idx = (int) (ch - 'A');
                arr[idx] += 1;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[maxIdx] < arr[i]) {
                smaxIdx = maxIdx;
                maxIdx = i;
            } else if (arr[smaxIdx] < arr[i]) {
                smaxIdx = i;
            }

        }
        char ans = (char) (smaxIdx + 'a');
        return ans;
    }

}

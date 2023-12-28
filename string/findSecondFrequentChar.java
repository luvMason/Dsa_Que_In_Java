package string;

public class findSecondFrequentChar {

    public static void main(String[] args) {
        String s = "ssaaa";
        char res = calculateFre(s);
        System.out.println(res);
    }

    public static char calculateFre(String str) {
        int maxIdx = 0;
        int smaxIdx = 0;
        int[] fre = new int[26];
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                int idx = (int) (ch - 'a');
                fre[idx] = fre[idx] + 1;
            } else if (ch > 'A' && ch <= 'Z') {
                int idx = (int) (ch - 'A');
                fre[idx] = fre[idx] + 1;
            }
        }

        for (int i = 0; i < fre.length; i++) {
            if (fre[maxIdx] < fre[i]) {
                smaxIdx = maxIdx;
                maxIdx = i;
            } else if (fre[smaxIdx] < fre[i]) {
                smaxIdx = i;

            }
        }
        char ans = (char) (smaxIdx + 'a');
        return ans;
    }

}

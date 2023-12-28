package practice_1;

public class s7 {
    public static void main(String[] args) {
       // String s = "llllvvveeo";
       String s = "llllLllllLLooooooOiiiii";
        char ans = smaxFre(s);
        System.out.println(ans);
    }

    public static char smaxFre(String str) {

        // int maxIdx = 0;
        // int smaxIdx = 0;
        // int[] fre = new int[26];
        int maxIdx = 0;
        int smaxIdx = 0;
        int[] fre = new int[26];

        // for (int i = 0; i < str.length(); i++) {

        //     char ch = str.charAt(i);
        //     if (ch >= 'a' && ch <= 'z') {
        //         int idx = (int) (ch - 'a');
        //         fre[idx] = fre[idx] + 1;
        //     } else if (ch >= 'A' && ch <= 'Z') {
        //         int idx = (int) (ch - 'A');
        //        fre[idx] = fre[idx] + 1;
        //     }
        // }
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

        // for (int i = 0; i < fre.length; i++) {
        //     if (maxIdx < fre[i]) {
        //         smaxIdx = maxIdx;
        //         maxIdx = i;
        //     } else if (smaxIdx < fre[i]) {
        //         smaxIdx = i;
        //     }
        // }
        for (int i = 0; i < fre.length; i++) {
            if (fre[maxIdx] < fre[i]) {
                smaxIdx = maxIdx;
                maxIdx = i;
            } else if (fre[smaxIdx] < fre[i]) {
                smaxIdx = i;

            }
        }

        // char ans = (char)(smaxIdx + 'A');
        // return ans;
        char ans = (char) (smaxIdx + 'A');
        return ans;
    }

}

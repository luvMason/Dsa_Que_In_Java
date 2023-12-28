package Practice;

public class casese {
    public static void main(String[] args) {
        String s = "ty name is ";
        String ans = camel(s);
        System.out.println(ans);
    }

    public static String camel(String str) {
        StringBuilder sb = new StringBuilder();
        int fc = str.charAt(0);
        // if(fc>='A' && fc<='Z'){
        //     fc=(char)(fc-'A'+'a');
        // }
        //  char fc = str.charAt(0);

        if(fc>='A' && fc<='Z'){
            fc=(char)(fc-'A'+'a');
        }
        // ans+=fc;
        sb.append(fc);

        for (int i = 1; i < str.length(); i++) {
            char pre = str.charAt(i - 1);
            char curr = str.charAt(i);
            if (pre==' ') {
                if (curr >= 'a' && curr <= 'z') {
                    curr = (char) (curr - 'a' + 'A');
                }
                sb.append(curr);
            } else if (curr !=' ') {
                sb.append(curr);
            }
        }
        String ans = sb.toString();
        return ans;
    }

}

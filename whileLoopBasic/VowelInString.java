package whileLoopBasic;

import java.util.*;

public class VowelInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        int length = str.length();
        int count = 0;
        int i = 0;
        while ( i < length) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                    ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                count++;
                
            }
            i++;
        }
        System.out.println(count);

    }

}

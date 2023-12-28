package Practice;

import java.util.*;

public class al9 {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        int n = 5;
        int rsum = (n * (n + 1)) / 2;

        al.add(1);
        al.add(2);
        al.add(3);
        al.add(5);

        int sum = 0;
        for (int i = 0; i < al.size(); i++) {
            sum += al.get(i);
        }

        System.out.println(rsum - sum);

    }

}

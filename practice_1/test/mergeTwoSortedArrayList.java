package practice_1.test;

import java.util.ArrayList;

public class mergeTwoSortedArrayList {
    public static void main(String[] args) {
         int arr[] = { 1, 2, 3, 4, 5, };
        int arr1[] = { 1, 22, 33 };

        ArrayList<Integer> al = new ArrayList<>();
        ArrayList<Integer> al1 = new ArrayList<>();
        ArrayList<Integer> res = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            al.add(arr[i]);

        }
        for (int i = 0; i < arr1.length; i++) {
            al1.add(arr1[i]);

        }
        int p1 = 0, p2 = 0 ;

        while (p1 != al.size() && p2 != al1.size()) {
            if (al.get(p1) > al1.get(p2)) {
                res.add(al1.get(p2));
                p2++;

            } else {
                res.add(al.get(p1));
                p1++;

            }
        }
            if (p1 == al.size()) {
                for (int i = p2; i < al1.size(); i++) {
                    res.add(al1.get(i));
                    // p2++;
                }
            } else {
                for (int i = p1; i < al.size(); i++) {
                    res.add(al.get(i));
                    // p1++;
                }
            }
        
        System.out.println(res);
    }
    
}

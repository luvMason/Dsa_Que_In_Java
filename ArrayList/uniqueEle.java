package ArrayList;

import java.util.*;

public class uniqueEle {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 1, 3, 1, 3, 3, 2, 4, 5, 6, 5, 4, 1, 2, 3 };
        ArrayList<Integer> res = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            int ele = arr[i];
            boolean flag = false;
            for (int j = 0; j < res.size(); j++) {
                int listElement = res.get(j);
                if (listElement == ele) {
                    flag = true;
                    break;

                }
            }
                if (flag == false) {
                    res.add(ele);
                }
            
        }
        System.out.println(res);
    }

}

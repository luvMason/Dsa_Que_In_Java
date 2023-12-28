package Practice;

import java.util.Scanner;

public class u3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row and column for first 2d Array");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();
        int[][] arr1 = new int[r1][c1];
        System.out.println("Enter the first 2d array");
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[0].length; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }
         System.out.println("Enter row and column for second 2d Array");
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();
        int[][] arr2 = new int[r2][c2];
        System.out.println("Enter the enter 2d array");
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[0].length; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }

        boolean flag = true;
        if (arr1.length == arr2.length && arr1[0].length == arr2[0].length) {
            for (int i = 0; i < arr1.length; i++) {
                for (int j = 0; j < arr1[0].length; j++) {
                    if (arr1[i][j] != arr2[i][j]) {
                        flag = false;
                    }

                }

            }
        } else {
            flag = false;
        }

        System.out.println(flag);

    }

}

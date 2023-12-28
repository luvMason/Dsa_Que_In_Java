package Practice;

public class u7 {
    public static void main(String[] args) {
        int[][] arr = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 100, 101, 105, 106 } };

        int k = 101;
        int r = 0;
        int c = arr[0].length - 1;
        int ra = -1;
        int ca = -1;
        while (r < arr.length && c >= 0) {
            if (k == arr[r][c]) {
                ra = r;
                ca = c;
                break;
                
            } else if (k > arr[r][c]) {
                r++;
            } else if (k < arr[r][c]) {
                c--;
            }

        }
        System.out.println(ra+" "+ca);
    }

}

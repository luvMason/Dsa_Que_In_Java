package Practice;

public class p13 {

    public static void main(String[] args) {
        int ans = 1;
        int d = 0;
        int count = 0;
        int[] arr = { 251, 99, 88, 9, 50, 67 };
        for (int i = 0; i < arr.length; i++) {
            int n = arr[i];

            for (; n > 0;) {
                int digit=n % 10;
                 if( digit >0){

                    count++; 
                }
                n = n / 10;

            }
            System.out.println(count);
            

        }

    }
}

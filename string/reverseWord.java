package string;

public class reverseWord {
    public static void main(String[] args) {
        String s = "love mason";
        String res = reverseWord(s);
        System.out.println(res);

    }

    public static String reverseWord(String str) {
        String[] arr = str.split(" ");
        String ans = "";
        for (int i = 0; i < arr.length; i++) {
            String temp = arr[i];
            String rev = reverse(temp);
            ans += rev + " ";
        }
        return ans;
    }

    public static String reverse(String str) {
        
        StringBuilder sb=new StringBuilder(str);

        sb.reverse();

        String ans=sb.toString();

        return ans;
    }

}
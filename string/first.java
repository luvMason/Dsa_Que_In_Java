package string;

public class first {
    public static void main(String[] args) {
        String str="hello";
        //find length of string
        int l=str.length();
        System.out.println(l);
   // specific character at perticular index
        char ch=str.charAt(0);
        System.out.println(ch);

        // substring

        String s="typeWriter";
        
        String sub1=s.substring(4);

        System.out.println(sub1);
   
        String sub2=s.substring(4,8);

        System.out.println(sub2);

        //split
        String b="java is a language";

        String[] arr=b.split("a");

        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }




        
    }
    
}

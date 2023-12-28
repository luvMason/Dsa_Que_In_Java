package string;

public class convertFirstLetterOfWordInString {
    public static void main(String[] args) {
        String s="my name is love";
        String ans=convert2(s);
        System.out.println(ans);
    }
    // public static String convert(String str){
    //     String[] arr=str.split(" ");
    //     String ans="";
    //     for(int i=0;i<arr.length;i++){
    //         String temp=temp.charAt(0);
    //         if((ch>='a') && (ch='a'+'A')){
                
    //         }

    //     }
    // }
    //second method
    public static String convert2(String str){
        String ans="";
        char fc=str.charAt(0);
        if(fc>='a' && fc<='z'){
            fc=(char)(fc-'a'+'A');

        }
        ans+=fc;

        for(int i=1;i<str.length();i++){
            char curr =str.charAt(i);
             char pre =str.charAt(i-1);
             if(pre==' '){
                if(curr>='a'&& curr<='z'){
                    curr=(char)(curr-'a'+'A');
                }
             }
             ans+=curr;

        }
           return ans;

    }

}

package string;

public class allSubstring {
    public static void main(String[] args) {
        String s="abcd";
        subString(s);
    }
    public static void subString(String s){
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<=s.length();j++){
              System.out.println(s.substring(i,j));
            }
        }
    }
    
}

package importantQues;

public class AllSubstringofString {
    public static void main(String[] args) {
        String s="abc";
       allSubString(s);
        
    }
    public static void allSubString(String str){
        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<=str.length();j++){
                System.out.println(str.substring(i, j));
            }
        }
    }
}

package practice_1;

public class s11 {
    public static void main(String[] args) {
        String s="abcd";
        substring(s);
        
    }
    public static void substring(String str){
        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<=str.length();j++){
                System.out.println(str.substring(i, j));
            }
        }
    }
    
}

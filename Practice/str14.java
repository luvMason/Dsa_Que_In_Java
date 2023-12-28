package Practice;

public class str14 {
    public static void main(String[] args) {
        String s="love";
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

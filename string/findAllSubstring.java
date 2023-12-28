package string;



public class findAllSubstring {
    public static void main(String[] args) {
        
        String s="love";
        subString(s);
       
        
    }
    public static void subString(String str){
        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<=str.length();j++){
                System.out.println(str.substring(i,j));
            }
        }
        
    }
    
}

package string;

public class countVowInString {
    public static void main(String[] args) {
        String s="love";
        int ans=countV(s);
        System.out.println(ans);
        
    }
    public static int countV(String str){
        int count=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='a' || ch=='i' || ch=='e' || ch=='o' || ch=='u' 
            ||ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U' ){
                count++;
            }
        }
        return count;
    }
    
}

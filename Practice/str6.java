package Practice;

public class str6 {
    public static void main(String[] args) {
        String s="love mason";
        int ans=find(s);
        System.out.println(ans);
    }
    public static int find(String str){
        char k='o';
        int count=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch==k){
              count++;
            }
        }
        return count;
    }
    
}

package string;

public class checkContainOnlydigit {
    public static void main(String[] args) {
        String s="9845974985q7";
        boolean ans=check(s);
        System.out.println(ans);
        
    }
    public static boolean check(String str){
        boolean flag=true;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch<'0'|| ch>'9'){
                flag=false;
            }
        }
        return flag;
    }
    
}

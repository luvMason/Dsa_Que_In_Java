package Practice;
public class str10 {
    public static void main(String[] args) {
        String s="343405e9834908";
        boolean ans=check(s);
        System.out.println(ans);
    }
    public static boolean check(String str){
        boolean flag=true;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch<'0'||ch>'9'){
                flag= false;
                break;
            }
        }
        return flag;

    }
}

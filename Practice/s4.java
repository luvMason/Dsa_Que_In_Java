package Practice;

public class s4 {
    public static void main(String[] args) {
        String s="49857475893745";
        boolean ans=check(s);
        System.out.println(ans);
    }
    public static boolean check(String str){
        boolean flag=true;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
              if(ch<'0'|| ch>'9'){
                  flag =false;
              
              }
        }
        return flag;
    }
    
}

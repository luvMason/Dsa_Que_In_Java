package Practice;

public class str3 {
    public static void main(String[] args) {
        String s="MY name is love mason";
        int ans=count(s);
        System.out.println(ans);
    }
    public static int count(String str){
        int count =0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='a'||ch=='i'|| ch=='o'||ch=='e'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
                count++;
            }
        }
        return count;
    }

    
}

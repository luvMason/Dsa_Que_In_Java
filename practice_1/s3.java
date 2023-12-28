package practice_1;

public class s3 {
    public static void main(String[] args) {
        String s="loveMason";
        int ans=countVow(s);
        System.out.println(ans);
    }
    public static int countVow(String str){
        
        int count=0;
        for(int i=0;i<str.length();i++){
          char ch=str.charAt(i);
          if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
            count++;
          }
        }
        return count;
    }
    
}

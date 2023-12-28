package Practice;

public class p5 {
    public static void main(String[] args) {
        String s="love";
        int l=s.length();
        int count=0;
        for(int i=0;i<l;i++){
            char ch=s.charAt(i);
            if(ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u'|| ch=='A'|| ch=='E'|| ch=='I'
            || ch=='O'|| ch=='U' ){
                count++;
            }
        }
        System.out.println(count);
    }
    
}

package Practice;

public class str4 {
    public static void main(String[] args) {
        String s="ksdjf ndlfkjdjf dnfkldsfnsdf";
        int ans=largestWord(s);
        System.out.println(ans);
    }
    public static int largestWord(String str){
        int max=0;
        int count=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch!=' '){
                count++;
            }else{

                max=Math.max(max, count);
                count=0;
            }
        }
        max=Math.max(max, count);
        return max;
    }
    
}

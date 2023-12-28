package AllQuestion.aaaaa;

public class allPosiblepermutation {
    public static void main(String[] args) {
        String s="abc";
        permutation(s,"");

    }
    public static void permutation(String s,String ans){
        if(s.length()==0){
            System.out.println(ans);
            return;
        }

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);

            String fc=s.substring(0, i);
            String sc=s.substring(i+1);

            String rem=fc+sc;
            permutation(rem,ans+ch);
                
        }
    }
}

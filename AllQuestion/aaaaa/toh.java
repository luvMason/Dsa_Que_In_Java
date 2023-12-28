package AllQuestion.aaaaa;

public class toh {
    public static void main(String[] args) {
        toh(3,'S','D','H');
    }
    public static void toh(int n,char S,char D, char H){

        if(n==1){
            System.out.println(n+"["+S+"->"+D+"]");
            return;
        }

        toh(n-1,S,H,D);
        System.out.println(n+"["+S+"->"+D+"]");
        toh(n-1,H,D,S);

    }
    
}

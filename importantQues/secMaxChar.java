package importantQues;

public class secMaxChar {
    public static void main(String[] args) {
        String s="eeeeeeee rrrrrr ttt yy uuoqpmsxnxxcx ";
        char ans=secMaxChar(s);
        System.out.println(ans);
    }
    public static char secMaxChar(String str){
        int fre[]=new int[26];
        int max=0;
        int smax=0;

        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch>='a'&&ch<='z'){
                int idx=(int)(ch-'a');
                fre[idx]+=1;

            }else{
                 if(ch>='A'&&ch<='Z'){
                int idx=(int)(ch-'A');
                 fre[idx]+=1;
            }
            }
        }

        for(int i=0;i<fre.length;i++){
            if(fre[max]<fre[i]){
                smax=max;
                max=i;
            }else if(fre[smax]<fre[i]){
                smax=i;
            }
        }

        char a=(char)(smax+'A');
        return a;
    }
    
}

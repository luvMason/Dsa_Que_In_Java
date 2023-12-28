package Practice;

import Array.max;

public class frequency {
    public static void main(String[] args) {
        String s="alskdjfkghpqwoeirrutymzzzzzcnvbxmcnvbhfjdhfhdjfhjdhhhhhffhhhhhhhhff";
        char ans=count(s);
        System.out.println(ans);
    }
      public static char count(String str){
        int maxidx=0;
        int smaxidx=0;
        int []fre=new int [26];
        for(int i=0;i<str.length();i++){
            char ch =str.charAt(i);
            if(ch>='a'&&ch<='z'){
                int idx=(int )(ch-'a');
                fre[idx]+=1;
            }else if(ch>='A'&&ch<='Z'){
                int idx=(int )(ch-'A');
                fre[idx]+=1;
            }
        }
        for(int i=0;i<fre.length;i++){
            if(fre[maxidx]<fre[i]){
                smaxidx=maxidx;
                maxidx=i;
            }else if(fre[smaxidx]<fre[i]){
                smaxidx=i;
            }
        }

        char ans=(char)(smaxidx+'A');
        return ans;
    
}
}

package importantQues;

public class mazePath {
    public static void main(String[] args) {
        int sr=0;
        int sc=0;
        int dr=2;
        int dc=2;

        mazePath(sr,sc,dr,dc,"");


    }
    public static void mazePath(int sr,int sc,int dr,int dc, String path){
        if(sr>dr||sc>dc){
            return;
        }else if(sr==dr&&sc==dc){
            System.out.println(path);
            return;
        }
        mazePath( sr, sc+1, dr, dc,  path+"h");
          mazePath( sr+1, sc, dr, dc,  path+"v");
    }
    
}

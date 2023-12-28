package AllQuestion.aaaaa;

public class mazePath {
    public static void main(String[] args) {
        path(0,0,2,2,"");

    }
    public static void path(int sr,int sc ,int dr,int dc,String path){
        if(sr>dr||sc>dc){
            return;
        }else if(sr==dr&&sc==dc){
            System.out.println(path);
        }

        path(sr,sc+1,dr,dc,path+"h");
        path(sr+1,sc,dr,dc,path+"v");

    }
}

package recursion;

import java.util.ArrayList;
import java.util.Stack;

public class mazePath {
    

 public static void main(String[] args) {
        int sr=0;
        int sc=0;
        int dr=2;
        int dc=2;

        printmaizepath(sr,sc,dr,dc,"");

    }
    public static  void printmaizepath(int sr,int sc,int dr,int dc,String path){
        if(sr>dr||sc>dc){
            return ;
        }else if(sr==dr&&sc==dc){
            System.out.println(path);
            return ;
        }
        printmaizepath(sr, sc+1, dr, dc, path+"H");
        printmaizepath(sr+1, sc, dr, dc, path+"V");
       // printmaizepath(sr+1, sc+1, dr, dc, path+"D");
    }
}
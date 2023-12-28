package practice_1;
import java.util.*;
public class alpermutation {
    public static void main(String[] args) {

        
       
        int sr=0;
        int sc=0;
        int dr=2;
        int dc=2;

        maze(sr,sc,dr,dc,"");
        
    }
    public static void maze(int sr,int sc,int dr,int dc,String path){
        if(sr>dr||sc>dc){
            
             return ; 
        }else if(sr==dr&&sc==dc){
           System.out.println(path);
             return ;  
        }
          
       maze(sr+1,sc,dr,dc,path+"h");
       maze(sr,sc+1,dr,dc,path+"v");

         

        


        }


        
    }
    


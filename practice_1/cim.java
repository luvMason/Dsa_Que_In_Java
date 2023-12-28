package practice_1;

import Array.max;

public class cim {
    public static void main(String[] args) {
        String s="lOvE mAsOn";
        String res=reverseWord(s);
        System.out.println(res);

        }

        public static String reverseWord(String str){
            String ans="";
            
           

            for(int i=0;i<str.length();i++){

                char ch=str.charAt(i);

                if(ch>='a'&&ch<='z'){
                    ch=(char)(ch-'a'+'A');
                }else if(ch>='A'&&ch<='Z'){
                    ch=(char)(ch-'A'+'a');

                }

                ans+=ch;
               

               
                    
            }

           

            return ans;

            
        }

        
    }


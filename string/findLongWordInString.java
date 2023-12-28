package string;

public class findLongWordInString {
    public static void main(String[] args) {
        String s="java is a language";
        
        int ans= check(s);
        System.out.println(ans);
        
    }
//     public static int check(String s){
//         String[] arr=s.split(" ");
//            int max=0;
//         for(int i=0;i<arr.length;i++){
//             int l=arr[i].length();
//             if(max<l){
//                 max=l;
//             }
//         }
//         return max;

//     }
// }
      public static int check(String s){
          int count=0;
          int max=0;
        for(int i=0;i<s.length();i++){
           char ch=s.charAt(i);
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


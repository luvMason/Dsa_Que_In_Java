package hashmap;
import java.util.*;
public class basic {
    public static void main(String[] args) {
        
        HashMap<String,Integer>hm=new HashMap<>();
           hm.put("Gaurav",1);
           hm.put("raju",10);
           hm.put("rohan",2);
            hm.put("rohan",8);
           hm.put("ram",5);

        System.out.println(hm.get("raju"));
         System.out.println(hm.containsKey("raju"));
        System.out.println(hm.containsValue(5));
        //hm.remove("raju");


       for(String s: hm.keySet()){
        System.out.println(s+" "+hm.get(s));
       }
          
        for(int i:hm.values()){
            System.out.println(i);
        }


        System.out.println(hm);
    }
}

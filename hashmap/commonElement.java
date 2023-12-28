package hashmap;

import java.util.HashMap;

public class commonElement {
    public static void main(String[] args) {
        HashMap<Integer,Integer>hm=new HashMap<>();

        int arr1[]={1,2,1,3,4};
        int arr2[]={1,2,1,3,7,6,2};

        for(int i=0;i<arr1.length;i++){
            int ele=arr1[i];

            if(hm.containsKey(ele)==true){
                hm.put(ele,hm.get(ele)+1);
            }else{

                hm.put(ele,1);
            }
          
        }

        for(int i=0;i<arr2.length;i++){
            int ele=arr2[i];

            if(hm.containsKey(ele)==true){
                System.out.println(ele);
                if(hm.get(ele)==1){
                  
                    hm.remove(ele);
                    
                }else{
                    hm.put(ele,hm.get(ele)-1);
                }
           }
        }
    
}
}

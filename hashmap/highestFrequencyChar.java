package hashmap;

import java.util.HashMap;

public class highestFrequencyChar {
    public static void main(String[] args) {
     HashMap<Integer,Integer>hm=new HashMap<>();

       
        int arr1[]={1,2,1,1,1,1,3,7,6,2};

        for(int i=0;i<arr1.length;i++){
            int ele=arr1[i];

            if(hm.containsKey(ele)==true){
                hm.put(ele,hm.get(ele)+1);
            }else{

                hm.put(ele,1);
            }
          
        } 
        int max=0;
        for(int i=0;i<arr1.length;i++){
             int ele=arr1[i];
            max=Math.max(max,hm.get(ele));
        }

        System.out.println(max);

    }
}

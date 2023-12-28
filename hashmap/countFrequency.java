package hashmap;

import java.util.HashMap;

public class countFrequency {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,2,3,4,1,21,34};
        HashMap<Integer,Integer>hm=new HashMap<>();

        for(int i=0;i<arr.length;i++){
            int ele=arr[i];

            if(hm.containsKey(ele)==true){
                hm.put(ele,hm.get(ele)+1);
            }else{

                hm.put(ele,1);
            }
        }

        System.out.println(hm);

    }
}

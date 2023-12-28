package Practice;

import java.util.ArrayList;

public class al5 {
    public static void main(String[] args) {
        ArrayList<Integer>al=new ArrayList<>();
        int arr[]={1,2,33,4,5};
        for(int i=0;i<arr.length;i++){
            al.add(arr[i]);

        }
        int p=1;
        for(int i=0;i<al.size();i++){
            if(i%2!=0){
                p*=al.get(i);
            }
        }
        System.out.println(p);
    
}
}

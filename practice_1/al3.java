package practice_1;

import java.util.ArrayList;

public class al3 {
    public static void main(String[] args) {
        ArrayList <Integer> al=new ArrayList<>();
        ArrayList <Integer> al1=new ArrayList<>();
         ArrayList <Integer> res=new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(7);
       
         al1.add(1);
        al1.add(2);
        al1.add(7);
       
        int p1=al.size()-1;
        int p2=al1.size()-1;
       
       int carry=0;
        while(p1>=0||p2>=0){
         

            int d1=p1>=0?al.get(p1):0;
            int d2=p2>=0?al1.get(p2):0;

            int sum=d1+d2+carry;

            int rd=sum%10;
            carry=sum/10;
            res.add(rd);
            p1--;
            p2--;
        }
            if(carry>0){
                ArrayList<Integer> res1=new ArrayList<>();

                res1.add(carry);
                for(int i=0;i<res.size();i++){
                    res1.add(res.get(i));
                }

                res=res1;
            }
            System.out.println(res);
    
               
    }
}

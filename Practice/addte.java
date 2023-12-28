package Practice;
import java.util.*;
public class addte {
    public static void main(String[] args) {
        ArrayList<Integer>al1=new ArrayList<>();
        ArrayList<Integer>al2=new ArrayList<>();
       al1.add(9);
       al1.add(9);
       al1.add(9);
       al1.add(9);
       al1.add(9);
       al2.add(1);
      ArrayList<Integer>res=new ArrayList<>();
       int p1=al1.size()-1;
       int p2=al2.size()-1;
       int carry=0;
       while(p1>=0||p2>=0){
        int d1=p1>=0?al1.get(p1):0;
        int d2=p2>=0?al2.get(p2):0;

        int sum=d1+d2+carry;
        int rd=sum%10;
         carry=sum/10;
         res.add(rd);
         p1--;
         p2--;

       }
       if(carry>0){
        ArrayList<Integer>ans=new ArrayList<>();
        ans.add(carry);
        for(int i=0;i<res.size();i++){
            ans.add(res.get(i));
        }
        res=ans;
       }
       System.out.println(res);

    }
    
}

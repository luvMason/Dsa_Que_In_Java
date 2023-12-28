package practice_1;

public class a1 {


    public static void main(String[] args) {
        
        int [] arr={1,2,2,2,2,2,2,4,5,6};
        int focc=-1;
        int locc=-1;
        int k=2;
        boolean flag =true;
        for(int i=0;i<arr.length;i++){
            if(k==arr[i]&&flag==true){
                focc=i;
                flag=false;
            }else if(k==arr[i]){
                locc=i;
            }
        
        }
        System.out.println(focc+ " "+ locc);
        }
}

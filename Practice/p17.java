package Practice;

public class p17 {
    public static void main(String[] args) {
        int[] arr={2,2,3,3,4,55};
        for(int i=0;i<arr.length-1;i++){
            boolean flag=true;
            for(int j=i+1;j<arr.length-1;j++){
                if(arr[i]==arr[j]&&flag==true){
                flag=false;
                 System.out.print(arr[i]+" ");
                }else{
                    System.out.print(arr[i]+" ");
                }
        }
    }
    
}
}
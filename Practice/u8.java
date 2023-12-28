package Practice;

public class u8 {
    public static void main(String[] args) {
        int arr[][]={{1,0,3},
                     {2,1,4},
                     {3,2,5}};
          boolean flag=true;
        for(int c=0;c<arr[0].length;c++){
            if(flag==true){
            for(int r=0;r<arr.length;r++ ){
                System.out.println(arr[r][c]);
            }
            flag=false;
        }else if(flag==false){
             for(int r=arr.length-1;r>=0;r--){
                System.out.println(arr[r][c]);
            }
            flag=true;
        }
        }             
    }
    
}

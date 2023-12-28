package practice_1;

public class d2a {
    public static void main(String[] args) {
        int[][]arr={{1,2,3},
                    {4,5,6},
                    {1,0,2}};
          boolean flag=true;

          for(int c=0;c<arr[0].length;c++){
                if(flag==true){
                    for(int r=0;r<arr.length;r++){
                        System.out.println(arr[r][c]);
                    }
                    flag =false;
                }else{
                    for(int r=arr.length-1;r>=0;r--){
                        System.out.println(arr[r][c]);
                    }
                    flag =true;
                }
          }
    }
    
}

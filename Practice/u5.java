package Practice;

public class u5 {
    public static void main(String[] args) {
        int [][]arr={{22,33,44},{2,3,4},{222,333,444},{0,9,8}};
        int k=333;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(k==arr[i][j]){
                    System.out.println(i+" "+j);
                }
            }
        }
    }
    
}

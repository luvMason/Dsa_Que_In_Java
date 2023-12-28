package practice_1;

public class a4 {
    public static void main(String[] args) {
        int []arr={3,3,45,2,522,5};

        int k=8;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==k){
                    System.out.println(i+ " "+j);
                    
                }
            }
        }
    }
}

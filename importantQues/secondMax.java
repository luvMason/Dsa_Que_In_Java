package importantQues;

public class secondMax {
    public static void main(String[] args) {
        int []arr={8,9,45,40};
        int max=0;
        int smax=0;
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                smax=max;
                max=arr[i];
            }else if(smax<arr[i]){
                smax=arr[i];
            }
        }
        System.out.println(smax);
    }
}

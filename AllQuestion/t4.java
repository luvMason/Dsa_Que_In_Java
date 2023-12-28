package AllQuestion;

public class t4 {
    public static void main(String[] args) {
        int [][]arr={{0,0,0,1,0},
                     {1,1,0,0,1},
                     {0,1,0,1,0},
                     {0,1,0,0,0}};

          int r=0;
          int c=0;
          int dis=0;
          
          while(true){
            dis=(dis+arr[r][c])%4;
             if(dis==0){
                c++;
            }else if(dis==1){
                r++;
            }else if(dis==2){
                c--;
            }else if(dis==3){
                r--;
            }

            if(r<0){
                r++;
                break;
            }else if(r==arr.length){
                r--;
                break;
            }else if(c<0){
                c++;
                break;
            }else if(c==arr[0].length){
                c--;
                break;
            }
          }

          System.out.println(r+" "+c);
    }
    
}

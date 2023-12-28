
import java.util.Stack;

public class QueueWithStackPop {
      public static void main(String[] args) {
        
    }
}

class MyQueue {

    Stack<Integer> main;
    Stack<Integer> helper;

    public MyQueue() {
        main = new Stack<>();
        helper = new Stack<>();
    }
    
    public void push(int x) {
       //1) main --> helper;
       while(main.size()!=0){
           helper.push(main.pop());
       }
       //2) x-->main
       main.push(x);
       // 3) helper --> main;

       while(helper.size()!=0){
           main.push(helper.pop());
       }
    }
    
    public int pop() {
        return main.pop();
    }
    
    public int peek() {
       return main.peek();
    }
    
    public boolean empty() {
        if(main.size()==0){
            return true;
        }else{
            return false;
        }
    }

}

import java.util.Stack;

public class QueueWithStackPush {
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
        main.push(x);
    }
    
    public int pop() {

        // 1) removing all the element expect one from main and moving to helper
        while(main.size()>1){
            helper.push(main.pop());
        }
        //2) removing one from main;
        int ele = main.pop();

        // 3) removing all from helper moving to main

        while(helper.size()>0){
            main.push(helper.pop());
        }

        return ele;

    }
    
    public int peek() {
        // 1) removing all the element expect one from main and moving to helper
        while(main.size()>1){
            helper.push(main.pop());
        }
        //2) removing one from main;
        int ele = main.pop();

        // 3) adding element to helper 

        helper.push(ele);

        // 4) removing all from helper moving to main

        while(helper.size()>0){
            main.push(helper.pop());
        }

        return ele;
    }
    
    public boolean empty() {
        if(main.size()==0){
            return true;
        }else{
            return false;
        }
    } 
}

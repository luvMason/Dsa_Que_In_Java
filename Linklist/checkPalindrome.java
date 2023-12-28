package Linklist;
// package stack;

import java.util.Stack;

public class checkPalindrome {
    public static void main(String[] args) {
        Solution s=new Solution();
        s.addLast(8);
         s.addLast(1);
          s.addLast(1);
           s.addLast(8);
          boolean ans= s.isPalindrome();
          System.out.println(ans);
    }
    
}
class ListNode{
    int val;
    ListNode next;

    ListNode(int v){
        this.val=v;
        this.next=null;
    }

}
class Solution{
    ListNode head;
    ListNode tail;
    int size=0;

    Solution(){
        this.head=null;
        this.tail=null;
        this.size=0;
    }
    public void addLast(int val){
        ListNode temp=new ListNode(val);
        if(this.size==0){
            this.head=this.tail=temp;
        }else{
           this.tail.next=temp;
            this.tail=temp;
            
        }
        this.size++;
    }

    public boolean isPalindrome() {
        
        Stack<ListNode> st=new Stack<>();
        ListNode temp=this.head;
        while(temp!=null){
            st.push(temp); 
            temp=temp.next;
        }

        ListNode temp2=this.head;
        while(temp2!=null){
            ListNode stNode=st.pop();
            if(stNode.val!=temp2.val){
                return false;
            }
            temp2=temp2.next;

        }
        return true;

    
    }
}


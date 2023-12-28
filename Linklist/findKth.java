package Linklist;

public class findKth {
    public static void main(String[] args) {
        Solution s=new Solution();
        s.addLast(2);
         s.addLast(22);
          s.addLast(23);
           s.addLast(11);
            s.addLast(55);
        int ans=s.getNthFromLast(2);
        System.out.println(ans);
        
    }
    
}
class Node
{
    int data;
    Node next;
    Node(int d) {
        this.data = d;
        this.next = null; }
}


class Solution
{
   Node head;
   int size;
   Node tail;

   Solution(){
        this.head=null;
        this.size=0;
        this.tail=null;
   }

   public void addLast(int val){
        Node temp=new Node(val);
        if(this.size==0){
            this.head=this.tail=temp;
        }else{
           this.tail.next=temp;
            this.tail=temp;
            
        }
        this.size++;
    }
       public int length(Node head){
            Node temp=this.head;
            int count=0;
            while(temp!=null){
                temp=temp.next;
                count++;
            }
            return count;
        }
    //Function to find the data of nth node from the end of a linked list.
   public int getNthFromLast( int n){
        //                              first method
        // if(this.head==null){
        //     return -1;
        // }
        // int size=length(head);
        // if(n<0||n>size){
        //     return -1;
        // }
        // if(size==n){
        //     return head.data;
        // }
        // int itr=size-n;
        // Node temp=this.head;
        // while(itr>0){
        //     temp=temp.next;
        //     itr--;
        // }
        // return temp.data;

//                                       optimize code
         Node slow=head;
      Node fast=head;
      while(n>0&&fast!=null){
          fast=fast.next;
          n--;
      }
      
      if(n>0){
          return -1;
      }
      while(fast!=null){
          fast=fast.next;
          slow =slow.next;
      }
      return slow.data;
      
    }

   }


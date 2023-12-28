package Linklist;

public class doubllyLinkLIst {
    public static void main(String[] args) {
        
    }

}
class dNode{
    int data;
    dNode next;
    dNode pre;
    
    dNode(int data){
        this.data=data;
        this.next=null;
        this.pre=null;
    }
}
class Linked{
    dNode head;
    dNode tail;

    int size;

    Linked(){
        this.head=null;
        this.tail=null;
        this.size=0;
    }

    public void addAtHead(int val){
        dNode temp=new dNode(val);
        if(this.size==0){
            this.head=this.tail=this.head.pre=temp;
        }else{
            
            temp.next=this.head;
            
            this.head=temp;
        }
        this.size++;

    }
}

package practice_1;

public class linkList {
    public static void main(String[] args) {
        Linked list=new Linked();
        list.addAtHead(10);
        list.addAtHead(45);
        list.addAtTail(60);
        list.addAtTail(90);
        list.addAtIndex(77,1);
        list.addAtIndex(88,3);
        list.removeFirst();
        
        list.removeFirst();
        list.deleteAtIndex(3);
        list.display();
    }
}
class Node{
    int data;
    Node next;
    Node pre;
    
    Node(int data){
        this.data=data;
        this.next=null;
        this.pre=null;
    }
}
class Linked{
    Node head;
    Node tail;

    int size;

    Linked(){
        this.head=null;
        this.tail=null;
        this.size=0;
    }

    public void addAtHead(int val){
        Node temp=new Node(val);
        if(this.size==0){
            this.head=this.tail=temp;
        }else{

            temp.next=this.head;
            temp=
            this.head=temp;
        }
        this.size++;

    }
    public void addAtTail(int val){
        Node temp=new Node(val);
        if(this.size==0){
            this.head=this.tail=temp;
        } else{
            this.tail.next=temp;
            this.tail=temp;
        }
        this.size++;
    }
    public void addAtIndex(int val, int index){
           if(index<0||index>this.size){
            System.out.println("Invalid Index");
           }else if(index==0){
            addAtHead(val);
           }else if(index==this.size){
            addAtTail(val);
           }else{
            Node temp=new Node(val);
            Node curr=this.head;
            while(index>1){
                curr=curr.next;
                index--;

            }
            Node nbr=curr.next;
            curr.next=temp;
            temp.next=nbr;
            this.size++;
           }
    }
    public int removeFirst(){
        if(this.size==0){
            System.out.println("List is empty");
             return -1;
        }else if(size==1){
            int ele=this.head.data;
            this.head=this.tail=null;
            this.size--;
             return ele;
        }else{
             int ele=this.head.data;
             this.head=this.head.next;
              this.size--;
            return ele;
        }
    }
    public int removeLast(){
         if(this.size==0){
            System.out.println("List is empty");
             return -1;
        }else if(size==1){
            int ele=this.head.data;
            this.head=this.tail=null;
            this.size--;
             return ele;
        }else{
            Node curr=this.head;
            for(int i=0;i<size-2;i++){
                curr=curr.next;

            }
            int ele=this.tail.data;
            curr.next=null;
            this.tail=curr;
            this.size--;
            return ele;
        }
    }
    public void display(){
        Node temp=this.head;
        while(temp!=null){
            System.out.print(temp.data + " ");
            temp=temp.next;
        }
        System.out.println();
    }
    //  public void deleteAtIndex(int index){
    //     if(index<0 || index>=size){
    //         System.out.println("Invalid Index");
    //        // return -1;
    //     }else if( index==0){
    //          this.removeFirst();
    //     }else if(index==this.size-1){
    //          this.removeLast();
    //     }else{
    //         Node curr=head;
    //         while(index>1){
    //             curr=curr.next;
    //             index--;
    //         }
    //         //int ele =curr.next.data;
    //         curr.next=curr.next.next;
    //         size--;
    //         //return ele;
    //     }
    // }

    public void deleteAtIndex(int index){
        if(index<0 || index>=size){
            System.out.println("Invalid Index");
           // return -1;
        }else if( index==0){
             //this.removeFirst();
             if(this.size==0){
            System.out.println("List is empty");
             //return -1;
        }else if(size==1){
            int ele=this.head.data;
            this.head=this.tail=null;
            this.size--;
            // return ele;
        }else{
            // int ele=this.head.data;
             this.head=this.head.next;
              this.size--;
           // return ele;
        }

        }else if(index==this.size-1){
             //this.removeLast();
              if(this.size==0){
            System.out.println("List is empty");
            // return -1;
        }else if(size==1){
            int ele=this.head.data;
            this.head=this.tail=null;
            this.size--;
            // return ele;
        }else{
            Node curr=this.head;
            for(int i=0;i<size-2;i++){
                curr=curr.next;

            }
            //int ele=this.tail.data;
            curr.next=null;
            this.tail=curr;
            this.size--;
           // return ele;
        }
        }else{
            Node curr=head;
            while(index>1){
                curr=curr.next;
                index--;
            }
            //int ele =curr.next.data;
            curr.next=curr.next.next;
            size--;
            //return ele;
        }
    }
}



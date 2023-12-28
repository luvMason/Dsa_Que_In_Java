package oops;

public class inheritance {
//     public static void main(String[] args) {
//         GrandParent g1=new GrandParent();
//         g1.money=483;

//         Parent p1=new Parent();
//         p1.Knowledge=4;
//         p1.money=200;

//         child c1=new child();
//         c1.Knowledge=1;
//         c1.money=-7598247;
//         c1.time=24;
//         c1.display();
        
    
//     }
    
// }
// class GrandParent{
//     int money;

//     void display(){
//         System.out.println("this is from grandparent");
//     }

// }
// class Parent extends GrandParent{//single level inheritance
//     int Knowledge;
//     void display(){
//         System.out.println("this is from parent");
//     }


// }
// class child extends Parent{// multilevel inheritance
//     int time;
     
// }

// //multiple inheritance is not available in java because of Diamond problem



 public static void main(String[] args) {

        // GrandParent g1 = new GrandParent(); // this object is having only one attribute
        // g1.money = 900;

        // Parent p1 = new Parent();
        // p1.money = 100;
        // p1.knowledge = 450;
        // //p1.display();

        child c1 = new child(400,20,24);
        // c1.knowledge = 0;
        // c1.money = 789;
        // c1.time = 24;

        // c1.display();

        System.out.println(c1.money + "   " + c1.knowledge + "  " + c1.time);

    }
}

class GrandParent {
    int money;

    GrandParent(int Mymoney){
        money=Mymoney;
      System.out.println("Constructor of GrandParent");
    }

    void display(){
        System.out.println("This is from grandparent ");
    }
}

class Parent extends GrandParent {   // single level inheritance 
    int knowledge;


     Parent(int Mymoney, int Myknowledge){
        super(Mymoney);
        knowledge=Myknowledge;
      System.out.println("Constructor of Parent");
    }
     void display(){
        System.out.println("This is from parent ");
    }
}

class child extends Parent {    // multilevel inheriatnce 
    int time;

     child(int Mymoney ,int Myknowledge , int Mytime  ){
        super(Mymoney,Myknowledge);
        time=Mytime;
      System.out.println("Constructor of child");
    }
}

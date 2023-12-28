package oops;

public class constructure {
    public static void main(String[] args) {
        Employee el=new Employee("om",78);
        System.out.println(el.name+ " "+el.id);
    }
    
}
class Employee{
    String name;
    int id;

    Employee(){   //default constructure

    }

    Employee(String ename, int eid){  //constructure overloading 
        name =ename;
        id =eid;
    }
}

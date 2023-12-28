package oops;

public class basics {
    public static void main(String[] args) {
        Student s1=new Student();//0bject
          s1.name="love";
          s1.age=21;
          s1.gender='m';
          s1.course="btech";
         // System.out.println(s1.name+" "+ s1.age+" "+s1.gender+" "+s1.course);
         s1.details();
         s1.details("ips");

    }
    
}
  class Student {//class

    String name;//attribute
    int age;
    String course;
    char gender;
                 //compile time polymorphismin
    public void details(){//method
        System.out.println("name is " + name + " age is " + age);

    }
    public void details(String collegeName){//method overloading
        System.out.println("course is " + course + " collegeName " + collegeName);
    }

}

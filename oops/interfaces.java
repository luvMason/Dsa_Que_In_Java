package oops;

public class interfaces {
    
 public static void main(String[] args) {
        
    }
}

interface  WaterAnimal{
     void eat();
     void drink();
     void breathe();
     void fins();
}

interface  landAnimal{
    void eat();
    void drink();
    void breathe();
    void limb();

}

class Amphibian implements landAnimal , WaterAnimal{


    public void eat(){

    }

    public void breathe(){

    }

    public void drink(){

    }

    public void limb(){

    }

    public void fins(){
        
    }
}

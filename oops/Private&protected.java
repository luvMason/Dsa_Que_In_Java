package oops;

public class Private&protected {

    
public static void main(String[] args) {
      human h1 = new human();

      h1.setBalance(100);

      System.out.println(h1.getBalance());
      
       man m1 = new man();

       
    }
}

class human{
    String name ;
    protected String number;
    private int balance ; 

    public void setBalance(int balance){  // setter function 
        this.balance = balance;
    }

    public int getBalance(){     // getter function 
        return this.balance;
    }
}

class man extends human  {

}

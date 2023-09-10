package oops;
import java.util.*;

public class inheritance {
    public static void main(String[] args) {
        System.out.println("This is Our Custrom Class");
     employees bhautik = new employees();// creating a new object
     // Setting properties
     bhautik.id = 20;
     bhautik.name = "Patel";
     //printing the attributes

    //  System.out.println(bhautik.id);
    //  System.out.println(bhautik.name);
        bhautik.print();
        bhautik.salary = 45;
        

        employees john = new employees();
        john.id = 40;
        john.name = "john Tripathi";
        john.salary = 12;
        john.email = "Bhautikpatrl23@gmail.com";
        john.getdetail();

       // john.print();
        int salary = john.getsalary();
        System.out.println(salary);

        String email = john.getdetail();
        System.out.println(email);
        
}
}
  class employees {
    int id ;
    String name;
    int salary;
    String email;


    public void print(){
    System.out.println(name +"id is" +" " +id);
    System.out.println( name + "name is" +" "+ name);
}

public int  getsalary(){
    return salary;
}
public String getdetail(){
    return email;
}
    
}


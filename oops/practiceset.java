package oops;

import java.util.Scanner;

public class practiceset {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        employees1 john = new employees1();
        john.salary = 45;
        john.name = "john";
      int salary =john.getsalary();
      System.out.println(salary);
      String name = john.getname();
      System.out.println(name);
    //   String newname = john.setname();
    //   System.out.println(newname);
    //   String newname = sc.nextline();
      
    phone p = new phone();
    p.vibrating();
    p.ringing();

    sqare s = new sqare();
   System.out.println(s.area(10)); 
    System.out.println(s.permiti(10));
    }
}
class employees1 {
    Scanner sc = new Scanner(System.in);

    int salary;
    String name;

    public int getsalary(){
        return salary;
    }
    public String getname(){
        return name;
    }
    // public String setname(){
    //     System.out.println("Enter a new Name");
    //     String newname = sc.nextLine();
    //    //System.out.println(newname);
    //    return newname;
    // }
}

/**
 * phone
 */
 class phone {

    public void ringing(){
        System.out.println("Its Ringing");
    }

    public void vibrating(){
        System.out.println("Its Vibrating");
    }
}

/**
 * Innerpracticeset
 */
 class sqare {
    int lenth;
    public int area(int lenth){
        lenth = 10;
        int area = lenth*lenth;
        return area;
    }
    public int permiti(int lenth){
        lenth = 10;
        int area = 2*(lenth + lenth);
        return area;

    }
    
}
class myclass2 extends myemployess{
    myemployess mitul = new myemployess();
   // mitul.setname("i am mitul")
}
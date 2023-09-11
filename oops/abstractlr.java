package oops;

public class abstractlr {
    public static void main(String[] args) {

        // parent2 obj = new parent2(); not possible abstract obj
        

    }
}

abstract class parent2{
    public parent2(){
        System.out.println(" I Am Constrcuter Of Base 2 Class");
    }
 abstract public void greet();
       
}

class child2 extends parent2{

    public void greet(){
        System.out.println("Good Morning");
    }
}

 abstract class child3 extends parent2{
    public void th(){
        System.out.println(" I am good");
    }
    
}


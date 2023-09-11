package oops;

public class dynamicmethoddispatch {
    public static void main(String[] args) {
       // one obj = new one();
         //two sam = new two();
        //obj.name();
       one obj = new two();
       obj.name();
       obj.greet();

    }
}
class one{
    public void greet(){
        System.out.println("good morning");
    }
    public void name(){
        System.out.println("My Name Is Bhautik");
    }
}



class two extends one {
    
    public void name(){
        System.out.println(" my name is not Bhautik");
    }
    public void swagat(){
        System.out.println("aapka swagat hai");
    }
}

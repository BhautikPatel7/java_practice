package oops;

public class methodoverride {
    public static void main(String[] args) {
        // b bh = new b();
        // bh.math();
        // b b = new b();
        // b.math3();
        System.out.println("I am method od main class");

    }
}
class a extends methodoverride{
    @ovverride;2
    public int a;
    methodoverride md = new methodoverride();
    public static void main(String[] args) {
        System.out.println("i am overrided");
    }
    public int harry(){
        return 4;

    }
    public void math(){
        System.out.println("I Am Printing Method of java class A");
    }
}
class b extends a{
public void math3(){
        System.out.println("I third Printing Method of java class A");
    }
    public void math(){
        System.out.println("I am Method of math 2");
    }
}
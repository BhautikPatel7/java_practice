package oops;

public class construcorinhertitance {
    public static void main(String[] args) {
        base1 b1 = new base1();
        derived1 d = new derived1(10,20);

        
    }
}
class base1{
    base1(){
        System.out.println("I am A Consrtcuter");
    }

    base1(int x){
        System.out.println("I am A with value of a");
    }

    int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
}

class derived1 extends base1{
    derived1(){
       // super(0);
        System.out.println("i am derived class constructer ");
    }
    derived1(int x, int y){
       super(0);
        System.out.println("i am derived class overloaded constructer ");
    }

    int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
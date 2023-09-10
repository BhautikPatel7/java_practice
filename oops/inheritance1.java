package oops;

public class inheritance1 {
    public static void main(String[] args) {

        derived dd = new derived();
       System.out.println(dd.setid(50));

        
    }
}
class base{
   public base(){
        System.out.println("Cunstror is called");
    }
    int id;
    public int setid(int id){
       this.id = id;
        return id;
    }

    public int getid(){
        return id;
    }

    public void printme(){
        System.out.println("I am Learning java");

    }
}

class derived extends base{
    
    int y;
    public int sety(int y){
        this.y = y;
        return y;
    }
    public int gety(){
        return y;
    }
}
package oops;

public class interfaceslr {
    public static void main(String[] args) {
        Aonecycle mycyle = new Aonecycle();
        mycyle.applybreak(1);
        
    }
}

interface byciycle{
    int a = 45;
    void applybreak(int dec);
    void speedup(int inc);

}
class Aonecycle implements byciycle{
    void blowhorn(){
        System.out.println(" ITs souting horn");
       
    }
    public  void applybreak(int dec){
            System.out.println(" applying break");
         };
        public void speedup(int inc){
            System.out.println(" I am Speeding up");
        }
}


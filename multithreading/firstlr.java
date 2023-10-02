package multithreading;

public class firstlr {
    public static void main(String[] args) {
        int n =8;
        for (int i = 0; i < 5; i++) {
            multithreading td = new multithreading();
            td.start();
        }
    }

    
}

class multithreading extends Thread{
    public void run(){
        System.out.println("Thread" + Thread.currentThread().getId() + "Running");
    } 

}

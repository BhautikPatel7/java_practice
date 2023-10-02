package multithreading;

public class throughimplement {
    public static void main(String[] args) {
        int n =8;
        multithreading1 td = new multithreading1();
         for (int i = 0; i < 5; i++) {
            
            td.run();
         }
    }
}

class multithreading1 implements Runnable{

    @Override
    public void run() {
        try{
            System.out.println(Thread.currentThread().getId()+ "Running");
        }
        catch(Exception e){
            System.out.println("Exception Occure" + e);
        }
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'run'");
    }


}

package multithreading;

public class mainthred {
    public static void main(String[] args) {
        Thread t = new Thread();
        System.out.println("Current ThreD :" + t.getName());
        
        t.setName("My Thread");
        System.out.println("Thread After Change Name ThreD :" + t.getName());
        t.setPriority(1);
        System.out.println("Main Thread Priority" + t.getPriority());
        for (int i = 0; i < 5; i++) {
            System.out.println("main Thread");
        }
        
        Thread ct = new Thread() {

            public void run()
            {
                for (int i = 0; i < 5; i++) {
                    System.out.println("Child thread");
                }
            }
        };

        System.out.println("Child thread priority: "
        + ct.getPriority());
        ct.setPriority(2);
        System.out.println("Child thread new priority: "
                           + ct.getPriority());
                           ct.start();

        }
    }

class ChildThread extends Thread {
 
    public void run()
    {
 
        for (int i = 0; i < 5; i++) {
 
            
            System.out.println("Child thread");
        }
    }
}

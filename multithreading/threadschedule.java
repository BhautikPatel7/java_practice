package multithreading;

public class threadschedule extends Thread {
    public void run(){
        System.out.println("Runnig The Run Method");
    }
    public static void main(String[] args) {
        threadschedule t1 = new threadschedule();
        threadschedule t2 = new threadschedule();
        threadschedule t3 = new threadschedule();

        System.out.println("t1 Thread properity :" + t1.getPriority() );
        System.out.println("t1 Thread properity :" + t2.getPriority() );
        System.out.println("t1 Thread properity :" + t3.getPriority() );

        t1.setPriority(5);
        t2.setPriority(6);
        t3.setPriority(7);

        System.out.println("t1 Thread properity :" + t1.getPriority() );
        System.out.println("t1 Thread properity :" + t2.getPriority() );
        System.out.println("t1 Thread properity :" + t3.getPriority() );

        System.out.println(
            "Currently Executing Thread : "
            + Thread.currentThread().getName());
 
        System.out.println(
            "Main thread priority : "
            + Thread.currentThread().getPriority());
 
       
        Thread.currentThread().setPriority(10);
 
        System.out.println(
            "Main thread priority : "
            + Thread.currentThread().getPriority());

        
        
    }
}

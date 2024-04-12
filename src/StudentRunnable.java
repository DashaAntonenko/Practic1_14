import java.util.concurrent.Semaphore;

public class StudentRunnable implements Runnable {
    private static Semaphore semaphore = new Semaphore(2);
    public void run (){
        try {
            System.out.println(Thread.currentThread().getName() + " waiting");
            semaphore.acquire();
            System.out.println(Thread.currentThread().getName()  + " eating");
            Thread.sleep(3000);
            System.out.println(Thread.currentThread().getName()  + " exit");
            semaphore.release();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

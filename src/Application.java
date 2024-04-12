import java.util.ArrayList;

public class Application {
    public static void main(String[] args) {
        System.out.println("Antonenko Darya Var:2 RIBO-04-22");
      StudentRunnable sr= new StudentRunnable();
        ArrayList <Thread> list = new ArrayList<>();
     for (int d = 0; d<7; d++)   {
         list.add(new Thread(sr, "Student " + (d+1)));
         list.get(d).start();
     }
     try {
         for (Thread student:list ){
             student.join();
         }
     }catch (Exception e){
         e.printStackTrace();
     }
    }
}


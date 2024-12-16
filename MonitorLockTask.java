import java.util.concurrent.ExecutionException;

public class MonitorLockTask {

    public synchronized void task1(){
        try{
            System.out.println("Inside task 1");
            Thread.sleep(10000);
            System.out.println("Task 1 completed");
        }catch (Exception e){

        }
    }

    public void task2(){
        System.out.println("Task 2 before synchronized");
        synchronized (this){
            System.out.println("Task 2 inseide synchronized");
        }
    }

    public void task3(){
        System.out.println("Inside task 3");
    }
}

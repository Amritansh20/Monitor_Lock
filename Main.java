public class Main {
    public static void main(String[] args) {
        final MonitorLockTask monitorLockTask = new MonitorLockTask();
        final MonitorThread_one monitorThread_one = new MonitorThread_one(monitorLockTask);
        Thread thread1 = new Thread(monitorThread_one);

        Thread thread2 = new Thread(()->{monitorLockTask.task2();});
        Thread thread3 = new Thread(()->{monitorLockTask.task3();});

        thread1.start();
        thread2.start();
        thread3.start();
    }
}

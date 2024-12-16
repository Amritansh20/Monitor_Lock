public class MonitorThread_one implements  Runnable{
    MonitorLockTask monitorLockTask;

    MonitorThread_one(MonitorLockTask monitorLockTask){
        this.monitorLockTask=monitorLockTask;
    }
    public void run() {
        monitorLockTask.task1();
    }
}

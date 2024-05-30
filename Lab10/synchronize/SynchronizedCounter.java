package threads.synchronize;

public class SynchronizedCounter implements Runnable{
    private Integer count = 0;

    @Override
    public void run() {
        for(int i = 0; i < 20; i++) {
            increment();
        }
    }

    public synchronized void increment() {
        count++;
        Thread currentThread = Thread.currentThread();
        System.out.println(currentThread.getName() + ": " + count);
    }

    /*public void increment() {
        count++;
        System.out.println(count);
    }*/

}


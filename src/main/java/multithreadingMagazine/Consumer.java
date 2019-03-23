package multithreadingMagazine;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable {

    private BlockingQueue bq;

    public Consumer(BlockingQueue bq) {
        this.bq = bq;
    }

    @Override
    public void run() {
        while (true) {
            try {
                System.out.println(" Bought " + bq.take());
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
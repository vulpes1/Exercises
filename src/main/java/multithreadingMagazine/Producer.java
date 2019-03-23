package multithreadingMagazine;

import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable {

    private BlockingQueue bq;

    public Producer(BlockingQueue bq) {
        this.bq = bq;
    }

    @Override
    public void run() {
        for (int i = 1; i <=50 ; i++) {
            System.out.println("Produced car n° " + i);
            try {
                bq.put("car n° " + i);
//                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

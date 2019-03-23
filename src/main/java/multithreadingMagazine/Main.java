package multithreadingMagazine;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Main {

    public static void main(String[] args) {

        BlockingQueue bq = new ArrayBlockingQueue(10);
        Producer producer = new Producer(bq);
        Consumer consumer = new Consumer(bq);

        new Thread(producer).start();
        new Thread(consumer).start();
    }
}

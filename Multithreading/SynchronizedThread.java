class Counter {
    private int count = 0;

    public synchronized void inceremnt() {
        count++;
    }

    int getCount() {
        return this.count;
    }

}

public class SynchronizedThread extends Thread {

    private Counter counter;

    public SynchronizedThread(Counter counter) {
        this.counter = counter;
    }

    public void run() {
        for (int i = 0; i < 10000; i++) {
            counter.inceremnt();
        }

    }

}

class Main {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        SynchronizedThread t1 = new SynchronizedThread(counter);
        SynchronizedThread t2 = new SynchronizedThread(counter);

        t1.start();
        t2.start();

        t1.join();
        t2.join();
        System.out.println(counter.getCount());
    }
}

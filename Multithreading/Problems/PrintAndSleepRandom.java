package Problems;

import java.util.*;

public class PrintAndSleepRandom implements Runnable {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        try {
            Thread.sleep((long) (Math.random() * 5000));
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

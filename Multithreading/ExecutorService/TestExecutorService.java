package ExecutorService;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestExecutorService {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService service = Executors.newFixedThreadPool(3);
        for (int i = 0; i < 10; i++) {
            Print task = new Print((char) i);
            service.submit(task);
        }

        // System.out.println(Thread.currentThread().getName());s

        service.shutdown();
    }
}

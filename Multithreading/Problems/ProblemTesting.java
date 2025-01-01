package Problems;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ProblemTesting {
    public static void main(String[] args) {
        // Problem 1
        // ExecutorService service = Executors.newSingleThreadExecutor();
        // PrintNum task1 = new PrintNum();
        // service.submit(task1);
        // service.shutdown();

        // Problem 2
        ExecutorService service = Executors.newFixedThreadPool(3);
        PrintAndSleepRandom task1 = new PrintAndSleepRandom();
        PrintAndSleepRandom task2 = new PrintAndSleepRandom();
        PrintAndSleepRandom task3 = new PrintAndSleepRandom();
        PrintAndSleepRandom task4 = new PrintAndSleepRandom();

        service.submit(task1);
        service.submit(task2);
        service.submit(task3);
        service.submit(task4);

        service.shutdown();

    }
}

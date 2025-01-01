package LearnRunnable.Problem;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class TestClass {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService service = Executors.newFixedThreadPool(3);
        PrintFactorial fact1 = new PrintFactorial(5);
        PrintFactorial fact2 = new PrintFactorial(10);
        PrintFactorial fact3 = new PrintFactorial(15);
        PrintFactorial fact4 = new PrintFactorial(20);

        Future<Integer> task1 = service.submit(fact1);
        Future<Integer> task2 = service.submit(fact2);
        Future<Integer> task3 = service.submit(fact3);
        Future<Integer> task4 = service.submit(fact4);

        System.out.print(task1.get() + " ");
        System.out.print(task2.get() + " ");
        System.out.print(task3.get() + " ");
        System.out.print(task4.get() + " ");

        service.shutdown();
    }
}

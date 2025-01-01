package ThreadCreation;

public class ThreadThree extends Thread {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        System.out.println("Task Three");
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d@ ", i);
        }
        System.out.println(Thread.currentThread().getName());
    }
}

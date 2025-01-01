package ThreadCreation;

// Can be done by exteding the thread class
public class ThreadCreationMainTesting {
    public static void main(String[] args) {
        ThreadOne task1 = new ThreadOne();
        ThreadTwo task2 = new ThreadTwo();
        ThreadThree task3 = new ThreadThree();
        System.out.println(Thread.currentThread().getName());
        task1.setPriority(Thread.MIN_PRIORITY); // setting priority of the tasks by calling setPriority() method.
        task1.start();
        System.out.println(Thread.currentThread().getName());
        task2.setPriority(Thread.NORM_PRIORITY);
        task2.start();
        System.out.println(Thread.currentThread().getName());
        task3.setPriority(Thread.MAX_PRIORITY);
        task3.start();
    }
}

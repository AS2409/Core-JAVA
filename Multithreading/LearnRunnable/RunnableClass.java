package LearnRunnable;

//Runnable is an interface which has abstract method run().
//In Thread class we have implemented run() method we overrite it in our thread
//If one class has extended one class then it cannot extends Thread class (multiple inheritance of class in not allowed) but we can implement as much interfaces as we want. So if class has already extended another class then we can implement Runnable interface and then pass that object (here RunnableClass object) to the Thread class object see in the psvm given below.

public class RunnableClass implements Runnable {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        RunnableClass p1 = new RunnableClass();
        Thread t1 = new Thread(p1);
        System.out.println(Thread.currentThread().getName());
        t1.start();
        System.out.println(Thread.currentThread().getName());
    }
}

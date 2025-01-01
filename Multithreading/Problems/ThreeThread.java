package Problems;

public class ThreeThread {
    public static void main(String[] args) throws InterruptedException {
        ThreadOne t1 = new ThreadOne();
        ThreadTwo t2 = new ThreadTwo();
        ThreadThree t3 = new ThreadThree();
        t1.start();
        t1.join();
        t2.start();
        t2.join();
        t3.start();

    }
}

class ThreadOne extends Thread {
    public void run() {
        System.out.println("I am in thread One " + Thread.currentThread());
    }

}

class ThreadTwo extends Thread {
    public void run() {
        System.out.println("I am in thread Two " + Thread.currentThread());
    }
}

class ThreadThree extends Thread {
    public void run() {
        System.out.println("I am in thread Three " + Thread.currentThread());
    }
}

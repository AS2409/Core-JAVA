package Problems;

public class CreatThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello from Thread X " + Thread.currentThread());
        }
    }
}

class CreatThreadTwo extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello from Thread Y " + Thread.currentThread());
        }
    }
}

class Main {

    public static void main(String[] args) {
        CreatThread x = new CreatThread();
        CreatThreadTwo y = new CreatThreadTwo();
        x.start();
        y.start();
    }
}

package ExecutorService;

public class Print implements Runnable {
    private char character;

    Print(char ch) {
        character = ch;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        for (int i = 1; i <= 100; i++) {
            System.out.print(character + " ");
        }
        System.out.println();

    }

}

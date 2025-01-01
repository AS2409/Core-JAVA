package LearnRunnable.Problem;

import java.util.concurrent.Callable;

public class PrintFactorial implements Callable {

    private int num;

    PrintFactorial(int num) {
        this.num = num;
    }

    @Override
    public Integer call() throws Exception {
        int fact = 1;
        for (int i = 2; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }

}

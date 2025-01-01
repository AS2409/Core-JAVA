package returningFutureOfThreads;

import java.util.concurrent.Callable;

public class CollableImplementation implements Callable {

    private String fullName;

    CollableImplementation(String name) {
        fullName = name;
    }

    @Override
    public String call() throws Exception {
        System.out.println("Fetching full name from server of " + fullName);
        Thread.sleep(4000);
        return fullName + " Sonkar";
    }

}

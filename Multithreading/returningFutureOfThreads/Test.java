package returningFutureOfThreads;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

//We have seen that threads do the work given by the main thread but it do not return anything to the main thread (eg. mummy ne dahi mangaya hmse toh yha mummy main thread h quiki hme dahi lane ka kaam dene ke baad wo apna kaam kr rhi hai, hm dahi laate h aur mummy ko de dete h mtlb hmne main thread yani mummy ko kch return kiya. Is case mein hm runnable interface ki jgha collable interface ka use krte h)
public class Test {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService service = Executors.newFixedThreadPool(2);
        CollableImplementation task1 = new CollableImplementation("Aditi");
        CollableImplementation task2 = new CollableImplementation("Ankush");
        CollableImplementation task3 = new CollableImplementation("Suman");
        CollableImplementation task4 = new CollableImplementation("Arvind");

        // Future means whenever the thread gets the result is will return it here (it
        // is like promise concept in javascript)
        Future<String> result1 = service.submit(task1);
        Future<String> result2 = service.submit(task2);
        Future<String> result3 = service.submit(task3);
        Future<String> result4 = service.submit(task4);

        System.out.println("Full name is " + result1.get());
        System.out.println("Full name is " + result2.get());
        System.out.println("Full name is " + result3.get());
        System.out.println("Full name is " + result4.get());

        service.shutdown(); // Without this the process will be running forever.

    }
}

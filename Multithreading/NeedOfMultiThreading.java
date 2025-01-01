
// Need: 
// 1) Task might be very important
// 2) Task might be independent
// 3) Multi Core CPU is sitting idle most of the time
// 4) A big task can be divided into smaller parts (distributed among multiple threads while main 
//    thread can interact to the user)
// 5) To make code responsive
public class NeedOfMultiThreading {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        // Task 1
        System.out.println("* task completed");
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d* ", i);
        }
        System.out.println();

        // Task 2
        System.out.println("# task completed");
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d# ", i);
        }
        System.out.println();

        // Task 3
        System.out.println("@ task completed");
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d@ ", i);
        }
        System.out.println();

        long endTime = System.currentTimeMillis();
        System.out.println("Start time: " + startTime + " End time: " + endTime + " total time: ");
        System.out.println("Total Time : " + (endTime - startTime));
    }
}

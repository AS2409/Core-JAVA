package ExceptionAndFileHangling.tryCatch;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter the first number: ");
            int first = sc.nextInt();
            System.out.println();
            System.out.println("Enter secod number : ");
            int second = sc.nextInt();
            System.out.println(first / second);
        } catch (ArithmeticException err) { // ArithmeticException = name of exception type and err is random name. if
                                            // the exception is not of type of ArithmeticException then it will not be
                                            // catched in the catch block. If we want to catch each and every exceptino
                                            // then write Throwable in place of exception name (in this example write
                                            // Throwable in place of ArithmeticException).
            System.out.println("Arithmetic exception");
            throw err; // or we can throw the exception like this
        }
    }
}

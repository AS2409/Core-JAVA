package ExceptionAndFileHangling.ThrowAndThrows;

public class TestClass {
    public static void nameCheck(String name) throws IllegalArgumentException { // throws keyword has to be written
                                                                                // after the complete function statement
        if (name.contains("-")) {
            throw new IllegalArgumentException("Name contains -"); // throw new <Exception type>("Write message");
        } else {
            System.out.println("Ok");
        }
    }

    public static void main(String[] args) {
        nameCheck("addu-");
    }
}


public class MainClass {
    public static void main(String[] args) {
        Book book1 = new Book(123);
        book1.borrowBook(123);
        // book1.returnBook(123);
        System.out.println(book1.getTotalBooks());

        // CouresClass student1 = new CouresClass();
        // student1.enrollStudent("Aditi Sonkar");
    }
}
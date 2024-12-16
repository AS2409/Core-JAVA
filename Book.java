public class Book {
    String title;
    String author;
    int isbn;
    static int totalBooks;
    static {
        totalBooks = 0;
    }
    {
        // Whenever the object is created increment the no of books
        totalBooks++;
    }

    Book(int isbn, String author, String title) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
    }

    Book(int isbn) {
        this(isbn, "NA", "NA");
    }

    static int getTotalBooks() {
        return totalBooks;
    }

    public void borrowBook(int isbn) {
        this.isbn = isbn;
        this.totalBooks--;
        System.out.println(this.totalBooks);
    }

    public void returnBook(int isbn) {
        this.isbn = isbn;
        this.totalBooks++;
        System.out.println(this.totalBooks);
    }

}

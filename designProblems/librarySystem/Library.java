package designProblems.librarySystem;

public class Library {

    int itemId;
    String title;
    String author;
    protected int totalItem;
    {
        totalItem = 0;
    }

    public void checkout(int itemId) {
        if (totalItem == 0) {
            System.out.println("No item left");
        } else {
            totalItem--;
        }
    }

    public void returnItem(int itemId) {
        totalItem++;
    }
}
public class LibrarayManagementSystem {
    public static void main(String[] args) {
        Book book = new Book("B001", "Effective Java", "Joshua Bloch");
        Magazine magazine = new Magazine("M001", "National Geographic", "Various Authors");
        DVD dvd = new DVD("D001", "Inception", "Christopher Nolan");

        book.displayItemDetails();
        System.out.println("Loan Duration: " + book.getLoanDuration() + " days\n");

        magazine.displayItemDetails();
        System.out.println("Loan Duration: " + magazine.getLoanDuration() + " days\n");

        dvd.displayItemDetails();
        System.out.println("Loan Duration: " + dvd.getLoanDuration() + " days");
    }
}

abstract class LibraryItem {
    private String itemId;
    private String title;
    private String author;

    public LibraryItem(String itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public abstract int getLoanDuration();

    public void displayItemDetails() {
        System.out.println("Item ID: " + getItemId());
        System.out.println("Title: " + getTitle());
        System.out.println("Author: " + getAuthor());
    }
}

class Book extends LibraryItem {
    public Book(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 14;
    }
}

class Magazine extends LibraryItem {
    public Magazine(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 7;
    }
}

class DVD extends LibraryItem {
    public DVD(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 3;
    }
}


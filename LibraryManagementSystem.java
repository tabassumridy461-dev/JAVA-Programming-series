import java.util.ArrayList;

public class Library {

    // Variables
    private String libraryName;
    private ArrayList<String> books;

    // Constructor
    public Library(String libraryName) {
        this.libraryName = libraryName;
        books = new ArrayList<>();
    }

    // Add Book
    public void addBook(String book) {
        books.add(book);
        System.out.println(book + " added successfully.");
    }

    // Remove Book
    public void removeBook(String book) {
        if (books.remove(book)) {
            System.out.println(book + " removed successfully.");
        } else {
            System.out.println(book + " not found.");
        }
    }

    // Display Books
    public void displayBooks() {
        System.out.println("\nLibrary: " + libraryName);
        System.out.println("Available Books:");

        if (books.isEmpty()) {
            System.out.println("No books available.");
        } else {
            for (String book : books) {
                System.out.println("- " + book);
            }
        }
    }

    // Main Method
    public static void main(String[] args) {

        // Object
        Library library = new Library("City Library");

        // Add Books
        library.addBook("Java Programming");
        library.addBook("Python Basics");
        library.addBook("Database Systems");

        // Display
        library.displayBooks();

        // Remove Book
        library.removeBook("Python Basics");

        // Display Again
        library.displayBooks();
    }
}

class Library {

    String[] books;

    int no_of_books;

    Library() {
        this.books = new String[100];
        this.no_of_books = 0;
    }

    void addBook(String book) {
        this.books[this.no_of_books] = book;
        no_of_books++;
        System.out.println(book + " has been added! ");
    }

    void showAvailableBooks() {
        System.out.println("Available Books are:");
        for (String book : this.books) {
            if (book == null) {
                continue;
            }
            System.out.println("* " + book);
        }
    }

    void issueBook(String book) {
        for (int i = 0; i < this.books.length; i++) {
            if (this.books[i].equals(book)) {
                System.out.println("The book has been issued!");
                this.books[i] = null;
                return;
            }
        }
        System.out.println("The book does not exist!");
    }

    void returnBook(String book) {
        addBook(book);
    }
}

public class CWH_61_ex4sol {
    public static void main(String[] args) {
        Library centralLibrary = new Library();
        centralLibrary.addBook("Harry Potter Book");
        centralLibrary.addBook("Think and Rich Grow Book");
        centralLibrary.addBook("The Monk Who Sold His Ferrari Book");
        centralLibrary.addBook("Rich and Poor Dad Book");
        centralLibrary.showAvailableBooks();

        centralLibrary.issueBook("Harry Potter Book");
        centralLibrary.showAvailableBooks();

        centralLibrary.returnBook("Harry Potter Book");
        centralLibrary.showAvailableBooks();
    }
}
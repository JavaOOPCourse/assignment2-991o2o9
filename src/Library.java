public class Library {
    private Book[] books;
    private int count;

    public Library(int capacity) {
        books = new Book[capacity];
        count = 0;
    }

    public void addBook(Book book) {
        books[count] = book;
        count++;
        System.out.println("Book was successfully added");
    }

    public void displayBooks() {
        if (count == 0) {
            System.out.println("Library is empty");
            return;
        }
        for (int i = 0; i < count; i++) {
            System.out.println(books[i].toString());
        }
    }

    public Book searchByTitle(String title) {
        for (int i = 0; i < count; i++) {
            if (books[i].getTitle().equalsIgnoreCase(title)) {
                return books[i];
            }
        }
        return null;
    }

    public void borrowBook(String title) {
        Book foundBook = searchByTitle(title);
        if (foundBook != null) {
            foundBook.borrowBook();
        } else {
            System.out.println("Book not found");
        }
    }

    public void returnBook(String title) {
        Book foundBook = searchByTitle(title);
        if (foundBook != null) {
            foundBook.returnBook();
        } else {
            System.out.println("Book not found");
        }
    }
}
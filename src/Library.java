public class Library {
    private Book[] books;
    private int count;

    public Library(int capacity) {
        books = new Book[capacity];
        count = 0;
    }

    public void addBook(Book book) {
        if (count >= books.length) {
            System.out.println("Library is full");
            return;
        }
        books[count++] = book;
        System.out.println("Book was successfully added");
    }


    public void displayBooks() {
        if (count == 0) {
            System.out.println("Library is empty");
            return;
        }
        for (int i = 0; i < count; i++) {
            System.out.println(books[i]);
        }
    }

    public Book searchByTitle(String title) {
        if (title == null) return null;

        for (int i = 0; i < count; i++) {
            if (books[i].getTitle().equalsIgnoreCase(title)) {
                return books[i];
            }
        }
        return null;
    }

    public void borrowBook(String title) {
        Book foundBook = searchByTitle(title);
        if (foundBook == null) {
            System.out.println("Book not found");
            return;
        }
        if (!foundBook.isAvailable()) {
            System.out.println("Book is already borrowed");
            return;
        }
        foundBook.borrowBook();
        System.out.println("Book borrowed successfully");
    }


    public void returnBook(String title) {
        Book foundBook = searchByTitle(title);
        if (foundBook == null) {
            System.out.println("Book not found");
            return;
        }
        if (foundBook.isAvailable()) {
            System.out.println("Book is already in library");
            return;
        }
        foundBook.returnBook();
        System.out.println("Book returned successfully");
    }
}
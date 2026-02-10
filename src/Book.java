public class Book {

    // TODO: make fields private
    private String title;
    private String author;
    private int year;
    private boolean isAvailable;

    // TODO: Implement parameterized constructor
    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.isAvailable = true;
    }

    // TODO: Implement copy constructor
    public Book(Book other) {
        this.title = other.title;
        this.author = other.author;
        this.year = other.year;
        this.isAvailable = other.isAvailable;
    }

    // TODO: Implement getters
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public boolean isAvailable() {
        return isAvailable;
    }


    // TODO: Implement borrow logic
    public void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
        }
    }

    // TODO: Implement return logic
    public void returnBook() {
        isAvailable = true;
    }

    // TODO: Override toString()
    @Override
    public String toString() {
        return "Title: " + title + ", Author: " + author + ", Year: " + year + ", Available: " + isAvailable;
    }

    // TODO: Override equals()
    @Override
    public boolean equals(Object obj) {
        Book other = (Book) obj;
        return title.equals(other.title)
                && author.equals(other.author)
                && year == other.year;
    }
}

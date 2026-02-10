import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Library library = new Library(10);

        int choice;

        String title;
        String author;
        int year;
        double fileSize;

        do {
            System.out.println("\n===== Library Menu =====");
            System.out.println("1. Add book");
            System.out.println("2. Add e-book");
            System.out.println("3. Display all books");
            System.out.println("4. Search book by title");
            System.out.println("5. Borrow book");
            System.out.println("6. Return book");
            System.out.println("7. Exit");
            System.out.print("Choose option: ");

            choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {

                case 1:
                    System.out.print("Enter book title: ");
                    title = scanner.nextLine();
                    System.out.print("Enter book author: ");
                    author = scanner.nextLine();
                    System.out.print("Enter the year: ");
                    year = scanner.nextInt();
                    scanner.nextLine();
                    library.addBook(new Book(title, author, year));
                    break;

                case 2:
                    System.out.print("Enter e-book title: ");
                    title = scanner.nextLine();
                    System.out.print("Enter e-book author: ");
                    author = scanner.nextLine();
                    System.out.print("Enter the year: ");
                    year = scanner.nextInt();
                    System.out.print("Enter the file size (MB): ");
                    fileSize = scanner.nextDouble();
                    scanner.nextLine();
                    library.addBook(new EBook(title, author, year, fileSize));
                    break;

                case 3:
                    library.displayBooks();
                    break;

                case 4:
                    System.out.print("Enter book title to search: ");
                    title = scanner.nextLine();
                    Book found = library.searchByTitle(title);
                    System.out.println(found != null ? found : "Book not found.");
                    break;

                case 5:
                    System.out.print("Enter the title to borrow: ");
                    title = scanner.nextLine();
                    library.borrowBook(title);
                    break;

                case 6:
                    System.out.print("Enter the title to return: ");
                    title = scanner.nextLine();
                    library.returnBook(title);
                    break;

                case 7:
                    System.out.println("Goodbye!");
                    break;

                default:
                    System.out.println("Invalid option!");
            }

        } while (choice != 7);

        scanner.close();
    }
}
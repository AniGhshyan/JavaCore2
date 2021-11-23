package Homework.author;

import java.util.Scanner;

public class AuthorBookTest {
    static Scanner scanner = new Scanner(System.in);
    static AuthorStorage authorStorage = new AuthorStorage();
    static BookStorage bookStorage = new BookStorage();

    private static final String EXIT = "0";
    private static final String ADD_AUTHORS = "1";
    private static final String ADD_BOOK = "2";
    private static final String SEARCH_AUTHORS = "3";
    private static final String SEARCH_AUTHORS_BY_AGE = "4";
    private static final String SEARCH_BOOKS_BY_TITLE = "5";
    private static final String PRINT_AUTHORS = "6";
    private static final String PRINT_BOOKS = "7";
    private static final String SEARCH_BOOKS_BY_AUTHOR = "8";
    private static final String COUNT_BOOKS_BY_AUTHOR = "9";
    private static final String CHANGE_AUTHOR = "10";
    private static final String CHANGE_BOOK_AUTHOR = "11";


    public static void main(String[] args) {
        authorStorage.add(new Author("poxos", "poxosyan", "poxos@mail.ru", 22, "male"));
        authorStorage.add(new Author("poxosuhi", "poxosyan", "poxosuhi@mail.ru", 23, "female"));
        authorStorage.add(new Author("petros", "petrosyan", "petros@mail.ru", 25, "male"));
        boolean isRun = true;
        while (isRun) {
            pritCommands();
            String command = scanner.nextLine();
            switch (command) {
                case EXIT:
                    isRun = false;
                    break;
                case ADD_AUTHORS:
                    addAuthor();
                    break;
                case ADD_BOOK:
                    addBook();
                    break;
                case SEARCH_AUTHORS:
                    searchByName();
                    break;
                case SEARCH_AUTHORS_BY_AGE:
                    searchByAge();
                    break;
                case SEARCH_BOOKS_BY_TITLE:
                    searchBooksBYTitle();
                    break;
                case PRINT_AUTHORS:
                    authorStorage.print();
                    break;
                case PRINT_BOOKS:
                    bookStorage.print();
                    break;
                case SEARCH_BOOKS_BY_AUTHOR:
                    serarchBooksByAuthor();
                    break;
                case COUNT_BOOKS_BY_AUTHOR:
                    countBookByAuthor();
                    break;
                case CHANGE_AUTHOR:
                    changeAuthor();
                    break;
                case CHANGE_BOOK_AUTHOR:
                    changeBookAuthor();
                    break;
                default:
                    System.out.println("Invalid command!");
            }
        }
    }

    private static void changeBookAuthor() {
        System.out.println("Please input book's title");
        String title = scanner.nextLine();
        if (bookStorage.getByTitle(title) != null) {
            changeAuthor();
        }
    }

    private static void changeAuthor() {
        System.out.println("please input author's email");
        String email = scanner.nextLine();
        if (authorStorage.getByEmail(email) != null) {
            System.out.println(authorStorage.getByEmail(email));
            System.out.println("please input author's name: ");
            String name = scanner.nextLine();
            authorStorage.getByEmail(email).setName(name);
            System.out.println("please input author's surname: ");
            String surname = scanner.nextLine();
            authorStorage.getByEmail(email).setSurname(surname);
            System.out.println("please input author's age: ");
            int age = Integer.parseInt(scanner.nextLine());
            authorStorage.getByEmail(email).setAge(age);
            System.out.println("please input author's gender: ");
            String gender = scanner.nextLine();
            authorStorage.getByEmail(email).setGendre(gender);
        } else {
            addAuthor();
        }
    }

    private static void countBookByAuthor() {
        System.out.println("please input author's email");
        String email = scanner.nextLine();
        bookStorage.countBook(email);
    }

    private static void serarchBooksByAuthor() {
        System.out.println("please input autor's email");
        String email = scanner.nextLine();
        bookStorage.searchBooksByAuthor(email);
    }

    private static void searchBooksBYTitle() {
        System.out.println("Please input keyword");
        String keyword = scanner.nextLine();
        bookStorage.searchBooksByTitle(keyword);
    }

    private static void addBook() {
        System.out.println("please choose autors's email");
        System.out.println("-----");
        authorStorage.print();
        System.out.println("-----");
        String email = scanner.nextLine();
        Author author = authorStorage.getByEmail(email);
        if (author != null) {
            System.out.println("please input book's title: ");
            String title = scanner.nextLine();
            System.out.println("please input book's description: ");
            String description = scanner.nextLine();
            System.out.println("please input book's price: ");
            double price = Double.parseDouble(scanner.nextLine());
            System.out.println("please input book's count: ");
            int count = Integer.parseInt(scanner.nextLine());
            Book book = new Book(title, description, price, count, author);
            bookStorage.add(book);
            System.out.println("Thank you,book was added");
        } else {
            System.out.println("invalid email! please try again");
            addBook();
        }

    }


    private static void searchByAge() {
        System.out.println("please input min age");
        int minAge = Integer.parseInt(scanner.nextLine());
        System.out.println("please input max age");
        int maxAge = Integer.parseInt(scanner.nextLine());
        authorStorage.searchByAge(minAge, maxAge);
    }

    private static void pritCommands() {
        System.out.println("please input " + EXIT + " for EXIT");
        System.out.println("please input " + ADD_AUTHORS + " for author");
        System.out.println("please input " + ADD_BOOK + " for book");
        System.out.println("please input " + SEARCH_AUTHORS + " for search author by name");
        System.out.println("please input " + SEARCH_AUTHORS_BY_AGE + " for search author by age");
        System.out.println("please input " + SEARCH_BOOKS_BY_TITLE + " for search book by title");
        System.out.println("please input " + PRINT_AUTHORS + " for print authors");
        System.out.println("please input " + PRINT_BOOKS + " for print books");
        System.out.println("please input " + SEARCH_BOOKS_BY_AUTHOR + " for search book by authors");
        System.out.println("please input " + COUNT_BOOKS_BY_AUTHOR + " for count book by authors");
        System.out.println("please input " + CHANGE_AUTHOR + " for change author's information");
        System.out.println("please input " + CHANGE_BOOK_AUTHOR + " for change author");
    }

    private static void searchByName() {
        System.out.println("Please input keyword");
        String keyword = scanner.nextLine();
        authorStorage.searchByName(keyword);
    }

    private static void addAuthor() {
        System.out.println("please input autor's name: ");
        String name = scanner.nextLine();
        System.out.println("please input autor's surname: ");
        String surname = scanner.nextLine();
        System.out.println("please input autor's email: ");
        String email = scanner.nextLine();
        System.out.println("please input autor's age: ");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("please input autor's gemder: ");
        String gender = scanner.nextLine();

        Author author = new Author(name, surname, email, age, gender);
        if (authorStorage.getByEmail(author.getEmail()) != null) {
            System.out.println("invalid email. Author with this email already exists");
        } else {
            authorStorage.add(author);
            System.out.println("Thank you,author was added");
        }
    }
}





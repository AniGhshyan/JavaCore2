package Homework.author;

import Homework.author.AuthorBookCommands;
import Homework.author.model.Author;
import Homework.author.model.Book;
import Homework.author.storage.AuthorStorage;
import Homework.author.storage.BookStorage;
import Homework.author.util.DateUtil;

import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;

public class AuthorBookTest implements AuthorBookCommands {
    static Scanner scanner = new Scanner(System.in);
    static AuthorStorage authorStorage = new AuthorStorage();
    static BookStorage bookStorage = new BookStorage();


    public static void main(String[] args) throws ParseException {
        authorStorage.add(new Author("poxos", "poxosyan", "poxos@mail.ru", 22, "male", DateUtil.stringToDate("12/05/1988")));
        authorStorage.add(new Author("poxosuhi", "poxosyan", "poxosuhi@mail.ru", 23, "female", DateUtil.stringToDate("03/04/1995")));
        authorStorage.add(new Author("petros", "petrosyan", "petros@mail.ru", 25, "male", DateUtil.stringToDate("16/11/2000")));
        boolean isRun = true;
        while (isRun) {
            AuthorBookCommands.pritCommands();
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
                case DELETE_BY_AUTHOR:
                    deleteByAuthor();
                    break;
                case DELETE_AUTHOR:
                    deleteAuthor();
                    break;
                case DELETE_BOOK:
                    deleteBook();
                    break;
                default:
                    System.out.println("Invalid command!");
            }
        }
    }

    private static void deleteBook() {
        System.out.println("Please choose book by serial id");
        System.out.println("-------");
        bookStorage.print();
        System.out.println("-------");
        String serialId = scanner.nextLine();
        Book book = bookStorage.getBySerailId(serialId);
        if (book != null) {
            bookStorage.delete(book);
        } else {
            System.out.println("Book with serail Id does not exists");
        }

    }

    private static void deleteByAuthor() {
        printAuthorsList();
        String email = scanner.nextLine();
        Author author = authorStorage.getByEmail(email);
        if (author != null) {
            bookStorage.deleteByAuthor(author);
        } else {
            System.out.println("Authore does not exists");
        }
    }

    private static void printAuthorsList() {
        System.out.println("please choose author's email");
        System.out.println("--------");
        authorStorage.print();
        System.out.println("--------");

    }

    private static void deleteAuthor() {
        printAuthorsList();
        String email = scanner.nextLine();
        Author author = authorStorage.getByEmail(email);
        if (author != null) {
            authorStorage.delete(author);
        } else {
            System.err.println("Author does not exists");
        }
    }

    private static void changeBookAuthor() {
        System.out.println("Please choose book's serialId");
        System.out.println("-----");
        bookStorage.print();
        System.out.println("-----");
        String serialId = scanner.nextLine();
        Book book = bookStorage.getByTitle(serialId);
        if (book != null) {
            printAuthorsList();
            String email = scanner.nextLine();
            Author author = authorStorage.getByEmail(email);
            if (author != null) {
                book.setAuthor(author);
            } else {
                System.err.println("Author does not exists");
            }
        } else {
            System.err.println("Book with serial Id does not exists");
        }
    }

    private static void changeAuthor() {
        printAuthorsList();
        String email = scanner.nextLine();
        Author author = authorStorage.getByEmail(email);
        if (author != null) {
            System.out.println(author);
            System.out.println("please input author's name: ");
            String name = scanner.nextLine();
            author.setName(name);
            System.out.println("please input author's surname: ");
            String surname = scanner.nextLine();
            author.setSurname(surname);
            System.out.println("please input author's age: ");
            int age = Integer.parseInt(scanner.nextLine());
            author.setAge(age);
            System.out.println("please input author's gender: ");
            String gender = scanner.nextLine();
            author.setGender(gender);
        } else {
            System.err.println("Author does not exists");
        }
    }

    private static void countBookByAuthor() {
        printAuthorsList();
        String email = scanner.nextLine();
        Author author = authorStorage.getByEmail(email);
        if (author != null) {
            bookStorage.countByAuthor(author);
        } else {
            System.out.println("Author does not exists");
        }

    }

    private static void serarchBooksByAuthor() {
        printAuthorsList();
        String email = scanner.nextLine();
        Author author = authorStorage.getByEmail(email);
        if (author != null) {
            bookStorage.serachByAuthor(author);
        } else {
            System.out.println("Author does not exists");
        }
    }

    private static void searchBooksBYTitle() {
        System.out.println("Please input keyword");
        String keyword = scanner.nextLine();
        bookStorage.searchBooksByTitle(keyword);
    }

    private static void addBook() {
        printAuthorsList();
        String email = scanner.nextLine();
        Author author = authorStorage.getByEmail(email);
        if (author != null) {
            System.out.println("please input book's serialId: ");
            String serialId = scanner.nextLine();
            if (bookStorage.getBySerailId(serialId) != null) {
                System.out.println("please input book's title: ");
                String title = scanner.nextLine();
                System.out.println("please input book's description: ");
                String description = scanner.nextLine();
                System.out.println("please input book's price: ");
                double price = Double.parseDouble(scanner.nextLine());
                System.out.println("please input book's count: ");
                int count = Integer.parseInt(scanner.nextLine());
                Book book = new Book(serialId, title, description, price, count, author);
                bookStorage.add(book);
                System.out.println("Thank you,book was added");
            } else {
                System.out.println("Book with SerialId: " + serialId + " is exists");
                addBook();
            }
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

    private static void searchByName() {
        System.out.println("Please input keyword");
        String keyword = scanner.nextLine();
        authorStorage.searchByName(keyword);
    }

    private static void addAuthor() throws ParseException {
        System.out.println("please input autor's name,surname,email,gender,age,dateOfBrith[12/12/2021]");
        String authorDataStr = scanner.nextLine();
        String[] authorData = authorDataStr.split(",");
        if (authorData.length == 6) {
            int age = Integer.parseInt(authorData[4]);
            Date date = DateUtil.stringToDate(authorData[5]);
            Author author = new Author(authorData[0], authorData[1], authorData[2], age, authorData[3], date);

            if (authorStorage.getByEmail(author.getEmail()) != null) {
                System.err.println("Invalid email. Author with this email already exists");
            } else {
                authorStorage.add(author);
                System.out.println("Thank you, author was added");
            }
        } else {
            System.err.println("invalid data");
        }


    }
}






package Homework.author;

import Homework.author.exception.BookNotFoundException;
import Homework.author.model.Author;
import Homework.author.model.Book;
import Homework.author.model.User;
import Homework.author.storage.AuthorStorage;
import Homework.author.storage.BookStorage;
import Homework.author.storage.UserStorage;
import Homework.author.util.DateUtil;

import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;

public class AuthorBookTest implements AuthorBookCommands {
    static Scanner scanner = new Scanner(System.in);
    static AuthorStorage authorStorage = new AuthorStorage();
    static BookStorage bookStorage = new BookStorage();
    static UserStorage userStorage = new UserStorage();


    public static void main(String[] args) throws ParseException {
        initData();
        boolean isRun = true;
        while (isRun) {
            AuthorBookCommands.printCommands();
            String command = scanner.nextLine();
            switch (command) {
                case EXIT:
                    isRun = false;
                    break;
                case LOGIN:
                    login();
                    break;
                case REGISTER:
                    register();
                    break;
                default:
                    System.out.println("Invalid command!");
            }
        }
    }

    private static void login() {
        System.out.println("Please input email");
        String email = scanner.nextLine();
        User user = userStorage.getByEmail(email);
        if (user != null) {
            System.out.println("Please input user's password");
            String password = scanner.nextLine();
            if (user.getPassword().equals(password)) {
                if (user.getType().equalsIgnoreCase("ADMIN")) {
                    adminLogin();
                } else if (user.getType().equalsIgnoreCase("USER")) {
                    userLogin();
                }
            } else {
                System.err.println("Password is wrong!!");
            }
        } else {
            System.err.println("user with " + email + "does not exists");
        }
    }

    private static void userLogin() {
        boolean isRun = true;
        while (isRun) {
            AuthorBookCommands.printUserCommands();
            String command = scanner.nextLine();
            switch (command) {
                case EXIT:
                    System.exit(0);
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
                    searchBooksByAuthor();
                    break;
                case COUNT_BOOKS_BY_AUTHOR:
                    countBookByAuthor();
                    break;
                case LOGOUT:
                    isRun = false;
                    break;
                default:
                    System.out.println("Invalid command!");
            }
        }
    }

    private static void register() {
        System.out.println("Please input email");
        String email = scanner.nextLine();
        User user = userStorage.getByEmail(email);
        if (user == null) {
            System.out.println("Please input user's name");
            String name = scanner.nextLine();
            System.out.println("Please input user's surname");
            String surname = scanner.nextLine();
            System.out.println("Please input user's password");
            String password = scanner.nextLine();
            System.out.println("Please input user's type(ADMIN or USER");
            String type = scanner.nextLine();
            if (type.equalsIgnoreCase("admin") || type.equalsIgnoreCase("user")) {
                User user1 = new User(email, name, surname, password, type.toUpperCase());
                userStorage.addUser(user1);
                System.out.println("User is register");
            } else {
                System.out.println("Type is invalid");
            }

        } else {
            System.err.println("user with " + email + "already exists");
        }

    }

    private static void adminLogin() {
        boolean isRun = true;
        while (isRun) {
            AuthorBookCommands.printAdminCommands();
            String command = scanner.nextLine();
            switch (command) {
                case EXIT:
                    System.exit(0);
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
                    searchBooksByAuthor();
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
                case ADD_TAG_TO_BOOK:
                    addTagsToBook();
                    break;
                case REMOVE_TAGS_FROM_BOOK:
                    removeTagsFromBook();
                    break;
                case LOGOUT:
                    isRun = false;
                    break;
                default:
                    System.out.println("Invalid command!");
            }
        }
    }


    private static void removeTagsFromBook() {
        System.out.println("Please choose book's serialId");
        System.out.println("-----");
        bookStorage.print();
        System.out.println("-----");
        String serialId = scanner.nextLine();
        Book book = null;
        try {
            book = bookStorage.getBySerialId(serialId);
            System.out.println("PLease input tags separate ,");
            String tagdStr = scanner.nextLine();
            String[] tagsToRemove = tagdStr.split(",");
            String[] bookTags = book.getTags();
            if (bookTags == null) {
                System.err.println("Book does not have any tags to remove!!!!");
            } else {
                for (String tag : tagsToRemove) {
                    boolean isExist = false;
                    for (String bookTag : bookTags) {
                        if (bookTag.equals(tag)) {
                            isExist = true;
                            break;
                        }
                    }
                    if (!isExist) {
                        System.out.println(tag + " does not exist on book: " + book);
                        return;
                    }
                }
                String[] newTags = new String[bookTags.length - tagsToRemove.length];
                int index = 0;
                for (String bookTag : bookTags) {
                    boolean isExist = false;
                    for (String toRemove : tagsToRemove) {
                        if (bookTag.equals(toRemove)) {
                            isExist = true;
                            break;
                        }
                    }
                    if (!isExist) {
                        newTags[index++] = bookTag;
                    }
                }
                book.setTags(newTags);
            }
        } catch (BookNotFoundException e) {
            System.out.println(e.getMessage());
        }


    }


    private static void addTagsToBook() {
        System.out.println("Please choose book's serialId");
        System.out.println("-----");
        bookStorage.print();
        System.out.println("-----");
        String serialId = scanner.nextLine();
        Book book = null;
        try {
            book = bookStorage.getBySerialId(serialId);
            System.out.println("PLease input tags separate ,");
            String tagsStr = scanner.nextLine();
            String[] tags = tagsStr.split(",");
            String[] bookTags = book.getTags();
            if (bookTags == null) {
                book.setTags(tags);
                System.out.println("Tags were added!!!");
            } else {
                for (String tag : tags) {
                    for (String bookTag : bookTags) {
                        if (tag.equals(bookTag)) {
                            System.err.println(tag + " is duplicate.PLease input new tags");
                            return;
                        }
                    }
                }
                String[] newTags = new String[bookTags.length + tags.length];
                System.arraycopy(bookTags, 0, newTags, 0, bookTags.length);
                System.arraycopy(tags, 0, newTags, bookTags.length, tags.length);
                book.setTags(newTags);
                System.out.println("Tags were added!!!");
            }
        } catch (BookNotFoundException e) {
            System.out.println(e.getMessage());
        }


    }

    private static void initData() throws ParseException {
        Author author = new Author("poxos", "poxosyan", "poxos@mail.ru", 22, "male", DateUtil.stringToDate("12/05/1988"));
        Author author1 = new Author("poxosuhi", "poxosyan", "poxosuhi@mail.ru", 23, "female", DateUtil.stringToDate("03/04/1995"));
        Author author2 = new Author("petros", "petrosyan", "petros@mail.ru", 25, "male", DateUtil.stringToDate("16/11/2000"));
        authorStorage.add(author);
        authorStorage.add(author1);
        authorStorage.add(author2);
        Author[] authors = {author1, author2};
        String[] tags = {"new", "popular", "detektiv", "lav girq"};
        Book book = new Book("AH5555", "girq1", "desc", 35, 2, authors, tags);
        bookStorage.add(book);
    }

    private static void deleteBook() {
        System.out.println("Please choose book by serial id");
        System.out.println("-------");
        bookStorage.print();
        System.out.println("-------");
        String serialId = scanner.nextLine();
        Book book = null;
        try {
            book = bookStorage.getBySerialId(serialId);
            bookStorage.delete(book);
        } catch (BookNotFoundException e) {
            System.out.println(e.getMessage());
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
        System.out.println("please choose author's email separate ,");
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
        Book book = null;
        try {
            book = bookStorage.getBySerialId(serialId);
            printAuthorsList();

            String emails = scanner.nextLine();
            String[] emailArray = emails.split(",");
            if (emailArray.length == 0) {
                System.err.println("Please choose authors");
                return;
            }
            Author[] authors = new Author[emailArray.length];
            int index = 0;
            for (String email : emailArray) {
                Author author = authorStorage.getByEmail(email);
                if (author != null) {
                    authors[index++] = author;
                } else {
                    System.err.println("Please input correct author's email ");
                    return;
                }
            }
            book.setAuthors(authors);
        } catch (BookNotFoundException e) {
            System.out.println(e.getMessage());
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

    private static void searchBooksByAuthor() {
        printAuthorsList();
        String email = scanner.nextLine();
        Author author = authorStorage.getByEmail(email);
        if (author != null) {
            bookStorage.searchByAuthor(author);
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
        String emails = scanner.nextLine();
        String[] emailArray = emails.split(",");
        if (emailArray.length == 0) {
            System.err.println("Please choose authors");
            return;
        }
        Author[] authors = new Author[emailArray.length];
        int index = 0;
        for (String email : emailArray) {
            Author author = authorStorage.getByEmail(email);
            if (author != null) {
                authors[index++] = author;
            } else {
                System.err.println("Please input correct author's email ");
                return;
            }
        }
        System.out.println("please input book's serialId: ");
        String serialId = scanner.nextLine();
        try {
            bookStorage.getBySerialId(serialId);
            System.out.println("Book is duplicate ");
        } catch (BookNotFoundException e) {
            System.out.println("please input book's title: ");
            String title = scanner.nextLine();
            System.out.println("please input book's description: ");
            String description = scanner.nextLine();
            System.out.println("please input book's price: ");
            double price = Double.parseDouble(scanner.nextLine());
            System.out.println("please input book's count: ");
            int count = Integer.parseInt(scanner.nextLine());
            System.out.println("Please input book's tags separate ,");
            String tagsSrt = scanner.nextLine();
            String[] tags = tagsSrt.split(",");
            Book book = new Book(serialId, title, description, price, count, authors, tags);
            bookStorage.add(book);
            System.out.println("Thank you,book was added");
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

    private static void addAuthor() {
        System.out.println("please input author's name,surname,email,gender,age,dateOfBirth[12/12/2021]");
        String authorDataStr = scanner.nextLine();
        String[] authorData = authorDataStr.split(",");
        if (authorData.length == 6) {
            int age = Integer.parseInt(authorData[4]);
            Date date = null;
            try {
                date = DateUtil.stringToDate(authorData[5]);
            } catch (ParseException e) {
                System.out.println("invalid date format");
                return;
            }
            Author author = new Author(authorData[0], authorData[1], authorData[2], age, authorData[3], date);

            if (authorStorage.getByEmail(author.getEmail()) != null) {
                System.err.println("Invalid email.Author with this email already exists");
            } else {
                authorStorage.add(author);
                System.out.println("Thank you, author was added");
            }
        } else {
            System.err.println("invalid data");
        }
    }
}






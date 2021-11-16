package Homework.author;

import java.util.Scanner;

public class AuthorTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AuthorStorage authorStorage = new AuthorStorage();
        for (int i = 0; i < 5; i++) {
            System.out.println("name: ");
            String name = scanner.next();
            System.out.println("surname: ");
            String surname = scanner.next();
            System.out.println("email: ");
            String email = scanner.next();
            System.out.println("age: ");
            int age = scanner.nextInt();
            System.out.println("gemder: ");
            String gender = scanner.next();
            Author author1 = new Author(name, surname, email, age, gender);
            authorStorage.add(author1);
        }
        authorStorage.print();

    }
}



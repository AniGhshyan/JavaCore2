package Homework.author;

import java.util.Scanner;

public class AuthorTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Author authors1 = new Author("Poxos", "Poxosyan", "Poxospoxos", 25, "boy");
        Author authors2 = new Author("Petros", "Petrosyan", "Petrospetros", 26, "boy");
        AuthorStorage authorStorage = new AuthorStorage();
        authorStorage.add(authors1);
        authorStorage.add(authors2);
        Author author3 = new Author();
        author3.setName("Davit");
        author3.setSurname("Davtyan");
        author3.setAge(30);
        author3.setEmail("davuk");
        author3.setGendre("boy");
        authorStorage.add(author3);
        System.out.println("Քանի հեղինակ ունենք");
        System.out.println(authorStorage.size);
        int num = scanner.nextInt();
        for (int i = 1; i <= 5; i++) {
                if (num < 0 || num > authorStorage.size) {
                    System.out.println("Այսպիսի հեղինակ չունենք");
                    break;
                }
                else authorStorage.print();break;
        }
    }
}


